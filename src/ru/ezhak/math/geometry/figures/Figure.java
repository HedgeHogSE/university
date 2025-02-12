package ru.ezhak.math.geometry.figures;

import ru.ezhak.math.geometry.Movable;
import ru.ezhak.math.geometry.points.Point2D;

public abstract class Figure implements Movable {
    protected Point2D point;

    public Figure(Point2D point) {
        this.point = point;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }

    public abstract double area ();

    public void shift (String coordinate, int step) {
        if ("x".equalsIgnoreCase(coordinate)) point.setX(point.getX() + step);
        else if ("y".equalsIgnoreCase(coordinate)) point.setY(point.getY() + step);
    }
}
