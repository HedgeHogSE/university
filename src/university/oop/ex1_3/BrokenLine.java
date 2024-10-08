package university.oop.ex1_3;

import university.oop.ex1_1.Point;

import java.util.Arrays;

public class BrokenLine {
    public Point[] points;

    public BrokenLine(Point[] points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Линия " + Arrays.toString(points);
    }
}
