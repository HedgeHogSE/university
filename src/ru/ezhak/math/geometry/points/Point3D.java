package ru.ezhak.math.geometry.points;

import ru.ezhak.storage.Box;

import java.util.*;

public class Point3D extends Point2D {

    protected int z;
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public static void putInBox (Box<? super Point3D> box, Point3D point3D) {
        box.pushObject(point3D);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Point3D point3D = (Point3D) o;
        return z == point3D.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), z);
    }

    @Override
    public String toString() {
        return String.format("{%d;%d;%d}", this.x, this.y, this.z);
    }
}
