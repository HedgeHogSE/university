package ru.ezhak.math.geometry.figures;

import ru.ezhak.math.geometry.points.Point;

public class Triangle extends Figure {
    private Point point2;
    private Point point3;
    public Triangle(Point point1, Point point2, Point point3) {
        super(point1);
        this.point2 = point2;
        this.point3 = point3;

    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    @Override
    public double area() {
        return 0.5 * Math.abs( (point2.getX() - point.getX()) * (point3.getY() - point.getY()) -
                (point3.getX() - point.getX()) * (point2.getY() - point.getY()) );
    }
}
