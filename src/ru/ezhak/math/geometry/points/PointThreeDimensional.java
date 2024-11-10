package ru.ezhak.math.geometry.points;

public class PointThreeDimensional extends Point {

    protected int z;
    public PointThreeDimensional(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("{%d;%d;%d}", this.x, this.y, this.z);
    }
}
