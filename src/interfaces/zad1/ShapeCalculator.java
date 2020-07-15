package interfaces.zad1;

public class ShapeCalculator {

    private Reader reader = new Reader();

    private void printoptions() {
        System.out.println("Wybierz opcje: ");
        System.out.println("0 - Wyjdz");
        System.out.println(Shape.RECTANGLE + " - Rectangle");
        System.out.println(Shape.CIRCLE + " - Circle");
    }

    private Rectangle createRectangle() {
        Rectangle rectangle = new Rectangle();
        return rectangle;
    }

    private Circle createCircle() {
        Circle circle = new Circle();
        return circle;
    }

    public Shape createShape() {
        boolean option = false;
        while (!option) {
            printoptions();
            int choose = (int) reader.getNumber();
            switch (choose) {
                case Shape.RECTANGLE:
                    chooseEquation(createRectangle());
                    break;
                case Shape.CIRCLE:
                    chooseEquation(createCircle());
                    break;
                case 0:
                    System.out.println("Do widzenia!");
                    reader.closeScanner();
                    option = true;
                    break;
                default:
                    System.out.println("Sprobuj jeszcze raz!");
            }
        }
        return null;
    }

    private void chooseEquation(Shape shape) {
        boolean choiceOk = false;
        while (!choiceOk) {
            printEquations();
            int choose = (int) reader.getNumber();
            switch (choose) {
                case 1:
                    choiceOk = true;
                    shape.calculateArea();
                    break;
                case 2:
                    choiceOk = true;
                    shape.calculatePerimeter();
                    break;
                default:
                    System.out.println("Sprobuj jeszcze raz: ");
            }
        }
    }

    private void printEquations() {
        System.out.println("Wybierz obliczenie: ");
        System.out.println("1 - Pole powierzchni");
        System.out.println("2 - Obwod");
    }
}

