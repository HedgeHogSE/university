package university.oop.ex1_2;

import university.oop.ex1_1.Point;
import university.oop.ex1_1.FullName;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(new Point(1,3), new Point(23,8));
        Line line2 = new Line(new Point(5,10), new Point(25,10));
        Line line3 = new Line(line1.point1, line2.point2);
        System.out.printf("l1: %s, l2: %s, l3: %s%n",line1, line2, line3);

        line1.point1.x = 2;
        line1.point1.y = 4;
        line2.point2.x = 35;
        line2.point2.y = 10;
        System.out.printf("l1: %s, l2: %s, l3: %s%n",line1, line2, line3);

        Human human = new Human(new FullName("Клеопатра"), 159);
        System.out.println(human);
    }
}
