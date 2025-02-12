package ru.ezhak.math.geometry.points;

import ru.ezhak.math.geometry.Movable;

import java.util.Objects;

public class Point2D implements Cloneable, Movable {
    protected int x;
    protected int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void shift (String coordinate, int step) {
        if ("x".equalsIgnoreCase(coordinate)) x += step;
        else if ("y".equalsIgnoreCase(coordinate)) y += step;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2D point = (Point2D) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public final Point2D clone() {
        try {
            return (Point2D) super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return String.format("{%d;%d}", this.x, this.y);
    }
}