package ru.ezhak.math.geometry.figures;

import ru.ezhak.math.geometry.points.Point2D;

public class Triangle extends Figure {
    private Point2D point2;
    private Point2D point3;
    public Triangle(Point2D point1, Point2D point2, Point2D point3) {
        super(point1);
        this.point2 = point2;
        this.point3 = point3;

    }

    public void shift (String coordinate, int step) {
        if ("x".equalsIgnoreCase(coordinate)) {
            point.setX(point.getX() + step);
            point2.setX(point.getX() + step);
            point3.setX(point.getX() + step);
        }
        else if ("y".equalsIgnoreCase(coordinate)) {
            point.setY(point.getY() + step);
            point2.setY(point.getY() + step);
            point3.setY(point.getY() + step);
        }
    }

    public Point2D getPoint2() {
        return point2;
    }

    public void setPoint2(Point2D point2) {
        this.point2 = point2;
    }

    public Point2D getPoint3() {
        return point3;
    }

    public void setPoint3(Point2D point3) {
        this.point3 = point3;
    }

    @Override
    public double area() {
        return 0.5 * Math.abs( (point2.getX() - point.getX()) * (point3.getY() - point.getY()) -
                (point3.getX() - point.getX()) * (point2.getY() - point.getY()) );
    }
}
