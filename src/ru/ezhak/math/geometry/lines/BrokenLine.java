package ru.ezhak.math.geometry.lines;

import ru.ezhak.math.geometry.points.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrokenLine brokenLine = (BrokenLine) o;
        if (brokenLine.getPoints().size() != this.getPoints().size()) return false;

        for (int i = 0; i < this.getPoints().size() - 1; i++) {
            Line line = new Line(brokenLine.points.get(i), brokenLine.points.get(i + 1));
            if (!line.equals(new Line(this.points.get(i), this.points.get(i + 1)))) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (points.isEmpty()) return "Нет линии";
        return "Линия " + points;
    }
}
