package university.oop.math.geometricFigures;

import java.util.Arrays;

public class BrokenLine {
    private Point[] points;

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

    public int length () {
        int result = 0;
        for (int i = 0; i < this.points.length - 1; i++) {
            result += new Line(this.points[i], this.points[i + 1]).length();
        }
        return result;
    }

    public Point[] getPoints() {
        return points;
    }

    @Override
    public String toString() {
        if (points == null) return "Нет линии";
        return "Линия " + Arrays.toString(points);
    }
}
