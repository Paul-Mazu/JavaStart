package enumy.training;

import java.util.Scanner;

public class TshirtShop {
    public static void main(String[] args) {

        System.out.println("Dostępne rozmiary: ");

        for (Size value: Size.values()) {
            System.out.println(value.toString());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz rozmiar: ");

        //Tshirt tshirt = new Tshirt(Size.valueOf(scanner.nextLine()));

        Size size = Size.fromDescription(scanner.nextLine());

        Tshirt tshirt = new Tshirt();
        tshirt.setSize(size);
        System.out.println("Wybrałeś: " + tshirt.toString());
    }
}
