package enumy.zad1;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz rodzaj pizza: ");

        PizzaKind.printKinds();

        Pizza pizza = new Pizza(PizzaKind.chosenPizza(scanner.nextLine()));

        System.out.println("Wybrałeś: " + pizza.getKind().toString());
    }
}
