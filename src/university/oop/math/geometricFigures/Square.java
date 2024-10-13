package university.oop.math.geometricFigures;

public class Square {
    private Point point;

    private int length;

    public Square(int x, int y, int length) throws Exception {
        this(new Point(x,y), length);
    }

    public Square(Point point, int length) throws Exception {
        setPoint(point);
        setLength(length);
    }

    public BrokenLine isBrokenLine () {
        BrokenLine brokenLine = new BrokenLine(this.point);
        brokenLine.addPoints(new Point(this.point.x + this.length, this.point.y));
        brokenLine.addPoints(new Point(this.point.x + this.length, this.point.y - this.length));
        brokenLine.addPoints(new Point(this.point.x, this.point.y - this.length));
        return brokenLine;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) throws Exception {
        if (length <= 0) throw new Exception("The length of the square must be greater than 0");
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("Квадрат в точке %s и с длиной %d", point, length);
    }
}
