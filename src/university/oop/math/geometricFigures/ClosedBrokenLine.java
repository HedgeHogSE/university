package university.oop.math.geometricFigures;

public class ClosedBrokenLine extends BrokenLine{
    public ClosedBrokenLine(Point... points) {
        super(points);
    }

    public ClosedBrokenLine() {
    }

    @Override
    public int length() {
        return super.length() + new Line(this.getPoints()[0],
                this.getPoints()[this.getPoints().length - 1])
                .length();
    }
}
