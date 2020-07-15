package Rekurencja.zad2;

public class App {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product product1 = new Product("Skaknka", 10);
        Product product2 = new Product("Leżak", 15);
        Product product3 = new Product("Rękawiczki", 25);
        Product product4 = new Product("Rękawiczki", 5);
        Product product5 = new Product("Rękawiczki", 2);

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);
        cart.addProduct(product5);

        System.out.println(cart.totalCost(cart.getItemsInCart()));

    }
}
