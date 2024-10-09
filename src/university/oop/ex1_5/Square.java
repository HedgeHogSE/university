package university.oop.ex1_5;

import university.oop.ex1_1.Point;
import university.oop.ex1_3.BrokenLine;

public class Square {
    public Point point;

    int length;

    public Square(int x, int y, int length) {
        this.point = new Point(x, y);
        this.length = length;
    }

    public BrokenLine isBrokenLine () {
        BrokenLine brokenLine = new BrokenLine(this.point);
        brokenLine.addPoints(new Point(this.point.x + this.length, this.point.y));
        brokenLine.addPoints(new Point(this.point.x + this.length, this.point.y - this.length));
        brokenLine.addPoints(new Point(this.point.x, this.point.y - this.length));
        return brokenLine;
    }

    @Override
    public String toString() {
        return String.format("Квадрат в точке %s и с длиной %d", point, length);
    }
}
