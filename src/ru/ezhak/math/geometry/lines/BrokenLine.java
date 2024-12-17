package ru.ezhak.math.geometry.lines;

import ru.ezhak.math.geometry.points.Point2D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrokenLine implements LineSegment {
    private List<Point2D> points;

    public BrokenLine(Point2D... points) {
        this.points = new ArrayList<>(Arrays.asList(points));
    }

    public BrokenLine() {
        this.points = new ArrayList<>();
    }

    public void addPoints(Point2D... points) {
        this.points.addAll(Arrays.asList(points));
    }

    public int length() {
        if (this.points.size() < 2) return 0;
        int result = 0;
        for (int i = 0; i < this.points.size() - 1; i++) {
            result += new Line(this.points.get(i), this.points.get(i + 1)).length();
        }
        return result;
    }

    public List<Point2D> getPoints() {
        return points;
    }

    private boolean compareLines (List<Point2D> points) {
        if (points.size() != this.getPoints().size()) return false;
        for (int i = 0; i < this.getPoints().size() - 1; i++) {
            Line line = new Line(points.get(i), points.get(i + 1));
            if (!line.equals(new Line(this.points.get(i), this.points.get(i + 1)))) return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || (o.getClass() != ClosedBrokenLine.class && getClass() != o.getClass())) return false;

        if (o instanceof ClosedBrokenLine) {
            ClosedBrokenLine closedBrokenLine = (ClosedBrokenLine) o;
            return compareLines(closedBrokenLine.getPoints());
        }

        else if (o instanceof BrokenLine) {
            BrokenLine brokenLine = (BrokenLine) o;
            return compareLines(brokenLine.getPoints());
        }
        else return false;
    }

    @Override
    public int hashCode() {
        int res = 0;
        for (Point2D point : points) {
            res += point.hashCode();
        }
        return res;
    }

    @Override
    public String toString() {
        if (points.isEmpty()) return "Нет линии";
        return "Ломанная линия " + points;
    }
}
