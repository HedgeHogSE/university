package ru.ezhak.math.geometry.figures;

import university.oop.math.geometry.points.Point;

public class Circle extends Figure {
    private int radius;
    public Circle(Point point, int radius) {
        super(point);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
