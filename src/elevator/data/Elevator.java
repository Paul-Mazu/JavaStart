package elevator.data;

public class Elevator {

    private Person[] people = new Person[4];
    private int peopleQty = 0;
    private final int maxWeight = 400;

    public void addPerson(Person person) {
        int weight = 0;
        for (int i = 0; i < peopleQty; i++) weight += people[i].getWeight();
        if (peopleQty < 4 && weight+person.getWeight() <= maxWeight) {
            people[getPeopleQty()] = person;
            System.out.println("Dodano: " + person.getName());
            peopleQty++;
        } else {
            System.out.println("Za dużo ludzi");
            start();
        }
}

    private void start() {
        System.out.println("Wjeżdżamy na góre mate");
    }

    public Person[] getPeople() {
        return people;
    }

    public int getPeopleQty() {
        return peopleQty;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setPeopleQty(int peopleQty) {
        this.peopleQty = peopleQty;
    }
}
