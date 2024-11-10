package ru.ezhak.math.geometry.lines;

import university.oop.math.geometry.points.Point;

public class ClosedBrokenLine extends BrokenLine {
    public ClosedBrokenLine(Point... points) {
        super(points);
    }

    public ClosedBrokenLine() {
        super();
    }

    @Override
    public int length() {
        int res = super.length();

        if (this.getPoints().getFirst().equals(this.getPoints().getLast())) {
            return res;
        }
        return res + new Line(this.getPoints().getFirst(),
                     this.getPoints().getLast())
                     .length();

    }
}
