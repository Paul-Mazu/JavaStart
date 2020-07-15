package logic;

import data.Car;

public class CarShop {
    public static void main(String[] args) {

        Car audi = new Car("Audi", "A4", "Black", 2019);
        Car bmw = new Car("BMW", "5", 2020);

        bmw.setCarColor("Red");
        audi.setYear(1900);

        audi.printInfo();
        bmw.printInfo();

    }
}
