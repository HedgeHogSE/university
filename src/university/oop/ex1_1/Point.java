package university.oop.ex1_1;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
       return String.format("{%d;%d}", this.x, this.y);
    }
}