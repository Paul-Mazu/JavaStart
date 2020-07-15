package klasyAbstrakcyjne;

public class SpeedTest {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle plane = new Plane();

        car.speedUp();
        plane.speedUp();

        System.out.println("Predkosc samochodu: " + car.getSpeed());
        System.out.println("Predkosc samolotu: " + plane.getSpeed());
    }
}
