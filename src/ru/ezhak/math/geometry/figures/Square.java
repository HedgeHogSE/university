package ru.ezhak.math.geometry.figures;

import ru.ezhak.math.geometry.lines.BrokenLine;
//import ru.ezhak.math.geometry.lines.ClosedBrokenLine;
import ru.ezhak.math.geometry.points.Point2D;

public class Square extends Figure {
    private Point2D point;

    private int length;

    public Square(int x, int y, int length) throws Exception {
        this(new Point2D(x,y), length);
    }

    public Square(Point2D point, int length) throws Exception {
        super(point);
        setLength(length);
    }

    public BrokenLine isBrokenLine () {
        BrokenLine brokenLine = new BrokenLine(this.point);
        brokenLine.addPoints(new Point2D(this.point.getX() + this.length, this.point.getY()));
        brokenLine.addPoints(new Point2D(this.point.getX() + this.length, this.point.getY() - this.length));
        brokenLine.addPoints(new Point2D(this.point.getX(), this.point.getY() - this.length));
        brokenLine.addPoints(this.point);
        return brokenLine;
    }

    /*public BrokenLine isClosedBrokenLine () {
        ClosedBrokenLine closedBrokenLine = new ClosedBrokenLine(this.point);
        closedBrokenLine.addPoints(new Point(this.point.getX() + this.length, this.point.getY()));
        closedBrokenLine.addPoints(new Point(this.point.getX() + this.length, this.point.getY() - this.length));
        closedBrokenLine.addPoints(new Point(this.point.getX(), this.point.getY() - this.length));
        return closedBrokenLine;
    }*/

    public int getLength() {
        return length;
    }

    public void setLength(int length) throws Exception {
        if (length <= 0) throw new Exception("The length of the square must be greater than zero");
        this.length = length;
    }

    @Override
    public double area() {
        return this.length * this.length;
    }

    @Override
    public String toString() {
        return String.format("Квадрат в точке %s и с длиной %d", point, length);
    }
}
