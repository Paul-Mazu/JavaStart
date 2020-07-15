package interfaces.zad1;

public class Circle implements Shape {

    Reader reader = new Reader();
    private double a;

    public Circle() {
        this.a = reader.getNumber();
    }

    @Override
    public void calculateArea() {
        System.out.println("Pole powierzchni wynosi: " + (a * a *PI));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Obwod wynosi: " + (2 * a * PI));
    }
}
