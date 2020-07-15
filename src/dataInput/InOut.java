package dataInput;

import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowdz swoje imie: ");
        String imie = scanner.nextLine();
        scanner.close();
        System.out.println("Twoje imie to: " + imie);
    }
}
