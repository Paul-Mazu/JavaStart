package specyfikatory.zad1.application;

import specyfikatory.zad1.data.Point;
import specyfikatory.zad1.logic.PointController;

public class PointApplication {
    public static void main(String[] args) {
        Point point = new Point(5, 10);
        PointController pointController = new PointController();

        pointController.addX(point, 3);
        pointController.minusX(point, 5);

        pointController.addY(point, 2);
        pointController.minusY(point, 4);

        System.out.println(point.getX() + " " + point.getY());

        final int moveRight = 0;
        final int moveLeft = 1;
        final int moveUp = 2;
        final int moveDown = 3;

        int move = moveDown;

        switch (move){
            case moveLeft:
                pointController.minusX(point, 1);
                break;
            case moveRight:
                pointController.addX(point, 1);
                break;
            case moveDown:
                pointController.minusY(point, 1);
                break;
            case moveUp:
                pointController.addY(point, 1);
                break;
        }

        System.out.println(point.getX() + " " + point.getY());

    }
}
