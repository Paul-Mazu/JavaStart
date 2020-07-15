package exceptions.example1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean result = true;
        int[] numbers = new int[5];
        do {
            try {
                System.out.println("Wpisz numer od 1 do 100");
                System.out.println(numbers[scanner.nextInt() - 1]);
                break;
            } catch (InputMismatchException | IndexOutOfBoundsException e) {
                System.out.println("Nie wpisałeś numeru!!!");
                scanner.nextLine();
            }
        } while (result);

        System.out.println("Wybrałeś numer: " + number);

    }
}
