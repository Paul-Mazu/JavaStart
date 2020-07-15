package polimorfizm.zad1;

public class HospitalApp {
    public static void main(String[] args) {


        Doctor doctor = new Doctor("Jan", "Kowalski", 10000, 2500);
        Person nurse = new Nurse("Janina", "Kowalska", 4000, 10);
        Hospital hospital = new Hospital();

        hospital.addPerson(doctor);
        hospital.addPerson(nurse);

        hospital.printStaff();
    }
}
