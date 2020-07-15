package loops.zad3;

import java.util.Scanner;

public class TemperatureControl {
    public static void main(String[] args) {

        final double tempChange = 0.5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj aktualną temperaturę: ");
        double actual = scanner.nextInt();
        scanner.nextLine();
        System.out.println("podaj oczekiwaną temperaturę: ");
        double expected = scanner.nextInt();
        scanner.nextLine();

        while (actual > expected) {
            actual = actual - tempChange;
            System.out.println(actual);
        }

        while (actual < expected) {
            actual += tempChange;
            System.out.println(actual);
        }

        scanner.close();

    }
}
