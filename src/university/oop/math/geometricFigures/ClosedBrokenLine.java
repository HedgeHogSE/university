package university.oop.math.geometricFigures;

public class ClosedBrokenLine extends BrokenLine{
    public ClosedBrokenLine(Point... points) {
        super(points);
    }

    public ClosedBrokenLine() {
        super();
    }

    @Override
    public int length() {
        int res = super.length();

        if (this.getPoints()[0].equals(this.getPoints()[this.getPoints().length - 1])) {
            return res;
        }
        return res + new Line(this.getPoints()[0],
                     this.getPoints()[this.getPoints().length - 1])
                     .length();

    }
}
