package enkapsulacja.aplication;

import enkapsulacja.data.Client;
import enkapsulacja.logic.DiscountService;
import enkapsulacja.logic.PrintInfo;

public class DiscountApp {
    public static void main(String[] args) {

        DiscountService service = new DiscountService();
        PrintInfo printInfo = new PrintInfo();
        Client client1 = new Client("Jan", "Kowalski", false);
        Client client2 = new Client("Pan", "Prezes", true);
        Client client3 = new Client(null, "Prezes", true);
        Client client4 = new Client("Pan", null, false);

        double price = 1000;

        double newPrice1 = service.calculateDiscount(client1, price);
        double newPrice2 = service.calculateDiscount(client2, price);
        double newPrice3 = service.calculateDiscount(client3, price);
        double newPrice4 = service.calculateDiscount(client4, price);

        printInfo.printPrice(client1, newPrice1);
        printInfo.printPrice(client2, newPrice2);
        printInfo.printPrice(client3, newPrice3);
        printInfo.printPrice(client4, newPrice4);
    }
}
