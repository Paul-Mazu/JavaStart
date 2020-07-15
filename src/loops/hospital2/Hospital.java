package loops.hospital2;

import java.util.Scanner;

public class Hospital {

    private final int maxPatients = 10;
    private Patient[] patients = new Patient[maxPatients];
    private int currentlyPatients = 0;

    public Hospital() {
    }

    public void addPatient() {
        if (currentlyPatients < maxPatients) {
            patients[currentlyPatients] = createPatient();
            currentlyPatients++;
        } else System.out.println("Za dużo pacjentów");
    }

    public void printPatients() {
        if (currentlyPatients == 0) System.out.println("Chwilowo nie ma pacjentów");
        else for (int i = 0; i < currentlyPatients; i++) patients[i].printPatient();
    }

    private Patient createPatient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj PESEL: ");
        String pesel = scanner.nextLine();
        scanner.close();
        return new Patient(name, nazwisko, pesel);

    }

}
