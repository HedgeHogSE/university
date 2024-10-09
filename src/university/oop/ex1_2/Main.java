package university.oop.ex1_2;

import university.oop.ex1_1.Point;
import university.oop.ex1_1.FullName;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(new Point(1,1), new Point(10,15));
        System.out.println(line1.lineLength());
    }
}
