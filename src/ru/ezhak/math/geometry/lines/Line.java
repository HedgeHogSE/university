package ru.ezhak.math.geometry.lines;

import ru.ezhak.math.geometry.points.Point;

import java.util.Objects;

public class Line implements LineSegment, Cloneable {
    private Point point1;
    private Point point2;

    public Line(Point pnt1, Point pnt2) {
        this.point1 = pnt1;
        this.point2 = pnt2;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1,y1), new Point(x2,y2));
    }

    public int length () {
        double x = (double)(this.point1.getX() - this.point2.getX());
        double y = (double)(this.point1.getY() - this.point2.getY());
        return (int)Math.round(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

    public Point getPoint1() {
        return new Point(point1.getX(), point1.getX());
    }

    public void setPoint1(Point point1) {
        this.point1.setX(point1.getX());
        this.point1.setY(point1.getY());
    }

    public Point getPoint2() {
        return new Point(point2.getX(), point2.getY());
    }

    public void setPoint2(Point point2) {
        this.point2.setX(point2.getX());
        this.point2.setY(point2.getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return (this.point1.equals(line.point1) && this.point2.equals(line.point2)) ||
                (this.point1.equals(line.point2) && this.point2.equals(line.point1));
    }

    @Override
    public int hashCode() {
        return point1.hashCode() + point2.hashCode();
    }

    @Override
    public Line clone(){
        try{
            Line clonedLine = (Line)super.clone();
            clonedLine.point1 = new Point(point1.getX(), point1.getY());
            clonedLine.point2 = new Point(point2.getX(), point2.getY());
            return clonedLine;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return String.format("Линия от %s до %s", point1, point2);
    }
}
