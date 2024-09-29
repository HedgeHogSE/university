package university.oop.ex1_2;

import university.oop.ex1_1.Point;

public class Line {
    Point point1;
    Point point2;

    public Line (Point pnt1, Point pnt2) {
        this.point1 = pnt1;
        this.point2 = pnt2;
    }

    public String toString() {
        return String.format("Линия от %s до %s", point1, point2);
    }
}
