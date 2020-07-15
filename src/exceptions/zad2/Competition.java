package exceptions.zad2;

public class Competition {
    private final String name;
    private final Participant[] participants;
    private int ageLimit;
    private int size;

    public Competition(String name, int maxParticipants, int ageLimit) {
        this.name = name;
        setAgeLimit(ageLimit);
        if (maxParticipants <= 0)
            throw new IllegalArgumentException("The Competition nas to contain min. 1 participant");
        this.participants = new Participant[maxParticipants];
    }

    public String getName() {
        return name;
    }

    public Participant[] getParticipants() {
        return participants;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        if (ageLimit <= 0) throw new IllegalArgumentException("The age limit can't be negative");
        this.ageLimit = ageLimit;
    }

    public int getSize() {
        return size;
    }

    private boolean findParticipant(Participant participant) {
        for (Participant temp : participants) {
            if (participant.equals(temp)) return true;
        }
        return false;
    }

    void addParticipant(Participant participant) throws AgeViolationException, MaxCompetitorsException, DuplicateException {
        if (participant.getAge() < ageLimit) throw new AgeViolationException();
        else if (size >= participants.length) throw new MaxCompetitorsException();
        else if (findParticipant(participant)) throw new DuplicateException();
        else {
            participants[size] = participant;
            size++;
        }
    }

    boolean hasFreeSpots() {
        return size < participants.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Zawody ")
                .append(name)
                .append("\n")
                .append("Liczba uczestników: ").append(size);
        for (int i = 0; i < size; i++) {
            builder.append("\n");
            builder.append(" > ");
            builder.append(participants[i].toString());
        }
        return builder.toString();
    }
}
