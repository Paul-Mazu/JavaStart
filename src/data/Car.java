package data;

public class Car {

    private String brand;
    private String model;
    private String carColor;
    private int year;

    public Car(String brand, String model, String carColor, int year) {
        this.brand = brand;
        this.model = model;
        this.carColor = carColor;
        this.year = year;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void printInfo() {
        System.out.println("Marka: "+brand+", Model: "+model+", Kolor: "+carColor+", Rok: "+year);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >=2000) {
            this.year = year;
        } else {
            System.out.println(brand + " rok niepoprawny");
        }
    }
}
