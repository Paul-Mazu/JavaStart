package algorytmika.zad3;

import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        printResult();
    }

    private static int getResult() {
        int multi = 1;
        int next = 0;
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < 5; index++) {
            System.out.println("Podaj liczbę nr " + (index + 1));
            next = scanner.nextInt();
            multi *= next;
        }
        return multi;
    }

    private static void printResult() {
        int result = getResult();
        if (result % 2 == 0) System.out.println("Wynik jest parzysty " + result);
        else System.out.println("Wynik jest nieparzysty " + result);
    }

}
