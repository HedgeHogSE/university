package university.oop.ex1_3;

import university.oop.ex1_1.Point;
import university.oop.ex1_2.Line;

import java.util.Arrays;

public class BrokenLine {
    public Point[] points;

    public BrokenLine(Point... points) {
        this.points = points;
    }

    public BrokenLine() {
        this.points = new Point[] {};
    }

    public void addPoints (Point... points) {
        Point[] newPoints = new Point[this.points.length + points.length];
        System.arraycopy(this.points, 0, newPoints, 0, this.points.length);
        System.arraycopy(points, 0, newPoints, this.points.length, points.length);
        this.points = newPoints;
    }

    public int brokenLineLength () {
        int result = 0;
        for (int i = 0; i < this.points.length - 1; i++) {
            result += new Line(this.points[i], this.points[i + 1]).lineLength();
        }
        return result;
    }

    @Override
    public String toString() {
        if (points == null) return "Нет линии";
        return "Линия " + Arrays.toString(points);
    }
}
