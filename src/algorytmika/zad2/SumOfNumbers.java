package algorytmika.zad2;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        result();


//        int sum = 0;
//        Scanner scanner = new Scanner(System.in);
//        int controller = 0;
//
//        while (controller <= 100) {
//            System.out.println("Podaj liczbę: ");
//            controller = scanner.nextInt();
//            if (controller <= 100) {
//                sum += controller;
//            }
//        }
//
//        System.out.println("Suma podanych liczb to: " + sum);
    }
    private int nextNumber() {
        Scanner scanner = new Scanner(System.in);
       return scanner.nextInt();
    }

    private static int result () {
        int result = 0;
        int next = 0;
        while (next <= 100) {
            System.out.println("Podaj liczbę: ");
            SumOfNumbers sumOfNumbers = new SumOfNumbers();
            next = sumOfNumbers.nextNumber();
            if (next <= 100) result+= next;
        }
        System.out.println("wynik to: " + result);
        return result;
    }
}
