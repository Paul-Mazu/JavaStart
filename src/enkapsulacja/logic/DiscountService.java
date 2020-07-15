package enkapsulacja.logic;

import enkapsulacja.data.Client;

public class DiscountService {

    public double calculateDiscount(Client client, double price) {
        if (client.isPremium()) return calculatePremiumDiscount(price);
        else return calculateStandardDiscount(price);
    }

    private double calculateStandardDiscount(double price) {
        if (price > 1000) return price *= 0.9;
        else return price;
    }

    private double calculatePremiumDiscount(double price) {
        if (price > 1000) return price *=0.85;
        else return price *= 0.95;
    }



}
