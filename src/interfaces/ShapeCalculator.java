package interfaces;

public class ShapeCalculator {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 10);

        System.out.println("Pole kola: " + circle.calculateArea());
        System.out.println("Obwod prostokata: " + rectangle.calculatePerimeter());
        System.out.println(circle.getData());

    }
}
