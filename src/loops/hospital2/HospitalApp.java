package loops.hospital2;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {

        final int close = 0;
        final int addNewPatient = 1;
        final int printPatients = 2;
        int choice = -1;

        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);

         while (choice != close) {
             System.out.println("Proszę wybrać opcje z menu: ");
             System.out.println("0 - zamknij aplikacje");
             System.out.println("1 - dodaj pacjenta");
             System.out.println("2 - wyświetl pacjentów");
             choice = scanner.nextInt();
             scanner.nextLine();
             switch (choice) {
                 case close:
                     System.out.println("Zamykam aplikację");
                     scanner.close();
                     break;
                 case addNewPatient:
                     hospital.addPatient();
                     break;
                 case printPatients:
                     hospital.printPatients();
                     break;
             }
         }
    }
}
