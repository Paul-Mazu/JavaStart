package loops.hospital;

public class Patient {
    private String imie;
    private String nazwisko;
    private String pesel;

    public Patient(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public void printPatientInfo() {
        System.out.println("Imię: " + imie + ", Nazwisko: " + nazwisko + ", PESEL: " + pesel);
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

}
