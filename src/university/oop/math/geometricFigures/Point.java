package university.oop.math.geometricFigures;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
       return String.format("{%d;%d}", this.x, this.y);
    }
}