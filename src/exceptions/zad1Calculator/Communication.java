package exceptions.zad1Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Communication {

    Scanner scanner = new Scanner(System.in);

    public double getNumber() {
        boolean error = true;
        do {
            System.out.println("Podaj liczbę:");
            try {
                double number = scanner.nextInt();
                return number;
            } catch (InputMismatchException e) {
                System.err.println("Nie podałeś liczby, spróbuj jeszcze raz: ");
            } finally {
                scanner.nextLine();
            }
        }while (error);
        return 0;
    }

    public void closeScanner() {
        scanner.close();
    }


}
