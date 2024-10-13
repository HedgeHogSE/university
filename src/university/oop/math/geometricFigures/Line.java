package university.oop.math.geometricFigures;

public class Line {
    private Point point1;
    private Point point2;

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

    public Point getPoint1() {
        return new Point(point1.x, point1.x);
    }

    public void setPoint1(Point point1) {
        this.point1.x = point1.x;
        this.point1.y = point1.y;
    }

    public Point getPoint2() {
        return new Point(point2.x, point2.y);
    }

    public void setPoint2(Point point2) {
        this.point2.x = point2.x;
        this.point2.y = point2.y;
    }

    public String toString() {
        return String.format("Линия от %s до %s", point1, point2);
    }
}
