package ru.ezhak.math.geometry.figures;

import university.oop.math.geometry.points.Point;

public abstract class Figure {
    protected Point point;

    public Figure(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public abstract double area ();
}
