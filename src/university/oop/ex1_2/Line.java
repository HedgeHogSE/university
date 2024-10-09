package university.oop.ex1_2;

import university.oop.ex1_1.Point;

public class Line {
    Point point1;
    Point point2;

    public Line (Point pnt1, Point pnt2) {
        this.point1 = pnt1;
        this.point2 = pnt2;
    }

    public Line (int x1, int x2, int y1, int y2) {
        this(new Point(x1,y1), new Point(x2,y2));
    }

    public int lineLength () {
        double x = (double)(this.point1.x - this.point2.x);
        double y = (double)(this.point1.y - this.point2.y);
        return (int)Math.round(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

    public String toString() {
        return String.format("Линия от %s до %s", point1, point2);
    }
}
