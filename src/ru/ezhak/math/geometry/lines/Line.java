package ru.ezhak.math.geometry.lines;

import ru.ezhak.math.geometry.points.Point2D;
import ru.ezhak.math.geometry.points.Point3D;

import java.util.Objects;

public class Line <T extends Point2D> implements LineSegment, Cloneable {
    private T point1;
    private T point2;

    public Line(T pnt1, T pnt2) {
        this.point1 = pnt1;
        this.point2 = pnt2;
    }

    //как быть с этим?
    public Line(int x1, int y1, int z1, int x2, int y2, int z2) {
        if (point1.getClass() == Point2D.class) {
            this.point1 = (T) new Point2D(x1, y1);
            this.point2 = (T) new Point2D(x2, y2);
        } else {
            this.point1 = (T) new Point3D(x1, y1, z1);
            this.point2 = (T) new Point3D(x2, y2, z2);
        }
    }

    public int length () {
        double x = (double)(this.point1.getX() - this.point2.getX());
        double y = (double)(this.point1.getY() - this.point2.getY());
        double z = 0;
        if (point1.getClass() == Point3D.class) {
            z = (double)( ((Point3D)this.point1).getZ() - ((Point3D)(this.point2)).getZ() );
        }
        return (int)Math.round(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
    }

    public T getPoint1() {
        if (point1 instanceof Point3D) return (T) new Point3D(point1.getX(), point1.getY(), ((Point3D) point1).getZ());
        return (T) new Point2D(point1.getX(), point1.getY());
    }

    public void setPoint1(T point1) {
        this.point1.setX(point1.getX());
        this.point1.setY(point1.getY());
    }

    public T getPoint2() {
        if (point2 instanceof Point3D) return (T) new Point3D(point2.getX(), point2.getY(), ((Point3D) point2).getZ());
        return (T) new Point2D(point2.getX(), point2.getY());
    }

    public void setPoint2(T point2) {
        this.point2.setX(point2.getX());
        this.point2.setY(point2.getY());
    }

    public static void shift (Line<?> line) {
        if (line.point1.getX() >= 0) line.point1.setX(line.point1.getX() + 10);
        else line.point1.setX(line.point1.getX() - 10);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line<?> line = (Line<?>) o;
        return (this.point1.equals(line.point1) && this.point2.equals(line.point2)) ||
                (this.point1.equals(line.point2) && this.point2.equals(line.point1));
    }

    @Override
    public int hashCode() {
        return point1.hashCode() + point2.hashCode();
    }

    @Override
    public Line clone(){
        try {
            Line clonedLine = (Line)super.clone();
            if (point1.getClass() == Point2D.class) {
                clonedLine.point1 = new Point2D(point1.getX(), point1.getY());
                clonedLine.point2 = new Point2D(point2.getX(), point2.getY());
            } else {
                clonedLine.point1 = new Point3D(point1.getX(), point1.getY(), ((Point3D)point1).getZ());
                clonedLine.point2 = new Point3D(point2.getX(), point2.getY(), ((Point3D)point2).getZ());
            }
            return clonedLine;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return String.format("Линия от %s до %s", point1, point2);
    }
}
