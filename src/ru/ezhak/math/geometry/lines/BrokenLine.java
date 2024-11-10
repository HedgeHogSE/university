package ru.ezhak.math.geometry.lines;

import university.oop.math.geometry.points.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrokenLine implements LineSegment {
    private List<Point> points;

    public BrokenLine(Point... points) {
        this.points = new ArrayList<>(Arrays.asList(points));
    }

    public BrokenLine() {
        this.points = new ArrayList<>();
    }

    public void addPoints(Point... points) {
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

    public List<Point> getPoints() {
        return points;
    }

    @Override
    public String toString() {
        if (points.isEmpty()) return "Нет линии";
        return "Линия " + points;
    }
}
