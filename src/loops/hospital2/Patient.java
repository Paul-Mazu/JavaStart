package loops.hospital2;

public class Patient {

    private String name;
    private String surname;
    private String pesel;

    public Patient(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void printPatient() {
        System.out.println("Imię: " + name + ", Nazwisko: " + surname + ", PESEL: " + pesel);
    }
}
