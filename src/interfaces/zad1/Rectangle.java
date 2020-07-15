package interfaces.zad1;

public class Rectangle implements Shape {
    private double a;
    private double b;
    Reader reader = new Reader();

    Rectangle() {
        this.a = reader.getNumber();
        this.b = reader.getNumber();
    }

    @Override
    public void calculateArea() {
        System.out.println("Pole powierzchni wynosi: " + a * b);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Obwod wynosi: " + (2*a + 2*b));
    }
}
