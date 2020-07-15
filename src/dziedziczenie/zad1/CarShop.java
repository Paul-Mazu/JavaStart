package dziedziczenie.zad1;

public class CarShop {
    public static void main(String[] args) {

        Tire tire = new Tire(1, "Goodyear", "Winter", 2019, 17, 235);

        System.out.println(tire.getSize());
    }
}
