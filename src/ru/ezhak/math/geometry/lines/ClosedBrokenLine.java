package ru.ezhak.math.geometry.lines;

import ru.ezhak.math.geometry.points.Point2D;

public class ClosedBrokenLine extends BrokenLine {
    public ClosedBrokenLine(Point2D... points) {
        super(points);
        if (points.length <= 2) return;
        if (points[0].equals(points[points.length - 1])) return;
        else addPoints(points[0]);
    }

    public ClosedBrokenLine() {
        super();
    }
}
