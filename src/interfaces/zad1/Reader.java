package interfaces.zad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reader {

    private Scanner scanner = new Scanner(System.in);

    public double getNumber() {
        boolean ifCorrect = false;
        double result = 0;
        while (!ifCorrect) {
            System.out.println("Podaj liczbe: ");
            try {
                result = scanner.nextDouble();
                ifCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("Musisz podac liczbe, sprobuj jeszcze raz: ");
            } finally {
                scanner.nextLine();
            }
        }
        return result;
    }

    public void closeScanner() {
        scanner.close();
    }
}
