package loops.hospital;

import java.util.Scanner;

public class Hospital {

    private Scanner scanner = new Scanner(System.in);
    private Patient[] patients = new Patient[10];

    int commend = 0;
    public void start() {
        do {
            System.out.println("Wybierz opcje z menu: 0 - Wyjście, 1 - dodaj pacjenta, 2 - wyswietl zapisanych pacjentów");
            commend = scanner.nextInt();
            scanner.nextLine();
            switch (commend) {
                case 0:
                    System.out.println("Zamykam aplikację");
                    break;
                case 1:
                    addPatientToArray(addPatient());
                    break;
                case 2:
                    printPatients();
                    break;
            }
        } while (commend != 0);
    }

    public Patient addPatient() {
        System.out.println("Podaj imie: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj numer PESEL: ");
        String pesel = scanner.nextLine();

        return new Patient(imie, nazwisko, pesel);
    }

    public void addPatientToArray(Patient patient) {
        int queueNumber = 0;
        while (patients[queueNumber] != null) {
            queueNumber ++;
        }
        patients[queueNumber] = patient;
    }

    public void printPatients() {
        int i = 0;
        while (patients[i] != null) {
            patients[i].printPatientInfo();
            i++;
        }
    }
}
