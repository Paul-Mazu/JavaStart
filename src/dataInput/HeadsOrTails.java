package dataInput;

import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Wybierz orzeł czy reszka: ");
        System.out.println("0 - orzeł");
        System.out.println("1 - reszka");

        int userChoice = scanner.nextInt();

        for (int i = 0; i < 999; i++) {
            if (userChoice == 0 || userChoice == 1){

                switch (userChoice){
                    case 1:
                        System.out.println("Wybrałeś Reszkę");
                        break;
                    case 0:
                        System.out.println("Wybrałeś Orła");
                }

                System.out.println("Flip the coin happens...");
                int result = random.nextInt(2);

                switch (result) {
                    case 0:
                        System.out.println("Wypadł Orzeł");
                        break;
                    case 1:
                        System.out.println("Wypadła reszka");
                }
                if (result == userChoice) System.out.println("Bralo wygrales");
                else System.out.println("Niestety nie udało Ci się, spróbuj jeszcze raz");
                break;
            }
            else {
                System.out.println("Wybierz jeszcze raz: ");
                userChoice = scanner.nextInt();
            }
        }

    }
}
