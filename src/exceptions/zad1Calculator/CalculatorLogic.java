package exceptions.zad1Calculator;

import java.util.InputMismatchException;

public class CalculatorLogic {
    Calculations calculations = new Calculations();
    Communication communication = new Communication();
    private double a = 0;
    private double b = 0;

    private void printOptions() {
        System.out.println("0 - Wyjdź z programu");
        System.out.println("1 - " + Equation.ADD.getDescription());
        System.out.println("2 - " + Equation.SUBTRACT.getDescription());
        System.out.println("3 - " + Equation.MULTIPLY.getDescription());
        System.out.println("4 - " + Equation.DIVIDE.getDescription());
    }

    public void choseOption() {
        int option;
        do {
            System.out.println("Wybierz rodzaj działania: ");
            printOptions();
            option = (int) communication.getNumber();
            if (option > 4 || option < 0) System.out.println("Podaj liczbę od 1 - 4");
            else {
                switch (option) {
                    case 0:
                        System.out.println("Do widzenia...");
                        break;
                    case 1:
                        getTwoNumbers();
                        System.out.println(calculations.add(a, b));
                        break;
                    case 2:
                        getTwoNumbers();
                        System.out.println(calculations.substract(a, b));
                        break;
                    case 3:
                        getTwoNumbers();
                        System.out.println(calculations.multiply(a, b));
                        break;
                    case 4:
                        boolean error = true;
                        do {
                            try {
                                getTwoNumbers();
                                System.out.println(calculations.divide(a, b));
                                error = false;
                                break;
                            } catch (ArithmeticException e) {
                                System.err.println("Dzielnik nie może byź równy 0!");
                            }
                        } while (error);
                }
            }
        } while (option != 0);

        communication.closeScanner();
    }

    private void getTwoNumbers() {
        a = communication.getNumber();
        b = communication.getNumber();
    }
}