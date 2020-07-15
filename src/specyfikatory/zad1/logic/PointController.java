package specyfikatory.zad1.logic;

import specyfikatory.zad1.data.Point;

public class PointController {

    public void addX(Point point, int x) {
        point.setX(point.getX()+x);
    }

    public void minusX(Point point, int x) {
        point.setX(point.getX()-x);
    }

    public void addY(Point point, int y) {
        point.setY(point.getY() + y);
    }

    public void minusY(Point point, int y) {
        point.setY(point.getY() - y);
    }

}
