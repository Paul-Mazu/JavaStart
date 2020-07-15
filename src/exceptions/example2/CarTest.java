package exceptions.example2;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car(30);

        try {
            car.refuel(10);
            System.out.println("Samochód posiada: " + car.getFuel() + " paliwa.");

            car.refuel(10);
            System.out.println("Samochód posiada: " + car.getFuel() + " paliwa.");

            car.refuel(10);
            System.out.println("Samochód posiada: " + car.getFuel() + " paliwa.");

        } catch (IllegalArgumentException e) {
            System.err.println("Nie można zatankować więcej paliwa");
        }
        try {
            car.drive();
            System.out.println("Samochód przejechał 100 km i zostało w baku: " + car.getFuel() + " paliwa.");
            car.drive();
            System.out.println("Samochód przejechał 100 km i zostało w baku: " + car.getFuel() + " paliwa.");
            car.drive();
            System.out.println("Samochód przejechał 100 km i zostało w baku: " + car.getFuel() + " paliwa.");
            car.drive();
            System.out.println("Samochód przejechał 100 km i zostało w baku: " + car.getFuel() + " paliwa.");
            car.drive();
            System.out.println("Samochód przejechał 100 km i zostało w baku: " + car.getFuel() + " paliwa.");
            car.drive();
            System.out.println("Samochód przejechał 100 km i zostało w baku: " + car.getFuel() + " paliwa.");
            car.drive();
            System.out.println("Samochód przejechał 100 km i zostało w baku: " + car.getFuel() + " paliwa.");
        } catch (IllegalStateException e) {
            System.err.println("Nie można jechać dalej, brak paliwa");
        }

    }
}