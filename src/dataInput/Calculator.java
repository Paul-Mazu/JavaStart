package dataInput;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz liczbe a:");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Jakie dzialanie chcesz wykonac?");
        String znak = scanner.nextLine();
        System.out.println("Wprowadz liczbe b:");
        double b = scanner.nextDouble();
        double result = 0;
        switch (znak) {
            case "*":
                result = a*b;
                break;
            case "/":
                result = a/b;
                break;
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
        }
        scanner.close();
        System.out.println(result);


    }
}
