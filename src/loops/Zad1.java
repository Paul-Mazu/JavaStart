package loops;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb chcesz wprowadzić?");
        int ileLiczb = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < ileLiczb; i++) {
            System.out.println("Wprowadź liczbę nr " + (i+1));
            result += scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Wynik dodawania wpisanych liczb to: " + result);
    }
}
