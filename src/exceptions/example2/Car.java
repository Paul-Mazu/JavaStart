package exceptions.example2;

public class Car {
    private static final double MAX_FUEL = 50;
    private static final double FUEL_CONSUMPTION = 8; // 8l/100km
    private double fuel;

    public Car(double fuel) {
        this.fuel = fuel;
    }

    public void refuel(double addFuel) {
        if (fuel + addFuel <= MAX_FUEL) fuel += addFuel;
        else throw new IllegalArgumentException();
    }

    public void drive() {
        if (fuel - FUEL_CONSUMPTION < 0) throw new IllegalStateException();
        else fuel -=FUEL_CONSUMPTION;
    }

    public double getFuel() {
        return fuel;
    }
}
