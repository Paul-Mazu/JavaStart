package Rekurencja.zad2;

public class Cart {

    public static final int MAX_PRODUCTS = 10;
    private Product[] products;
    private int itemsInCart = 0;

    public Cart() {
        this.products = new Product[MAX_PRODUCTS];
    }

    public void addProduct(Product product) {
        products[itemsInCart] = product;
        itemsInCart++;
        System.out.println("Dodano produkt do koszyka: " + itemsInCart);
    }

    public double totalCost(int itemsInCart) {
        if (itemsInCart > 1) {
            return products[itemsInCart-1].getPrice() + totalCost(itemsInCart - 1);
        } else return products[itemsInCart-1].getPrice();
    }

    public int getItemsInCart() {
        return itemsInCart;
    }
}
