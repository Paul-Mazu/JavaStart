package enkapsulacja.logic;

import enkapsulacja.data.Client;

public class PrintInfo {

    public void printPrice(Client client, double price) {
        if (client.getName() == null) System.out.println("Dzien dobry panie " + client.getSurname() + ", do zaplaty: " + price);
        else if (client.getSurname() == null) System.out.println("Witaj " + client.getName() + ", do zaplaty: " + price);
        else if (client.getName() == null && client.getSurname() == null) System.out.println("Witaj nieznajomy, do zaplaty: " + price);
        else System.out.println("Witaj " + client.getName() + " " + client.getSurname() + ", do zaplaty: " + price);
    }
}
