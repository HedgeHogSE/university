package university.oop.ex1_3;

import university.oop.ex1_1.Point;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Вася", new int[] {3,4,5});
        System.out.printf("%s\n", student1);
        Student student2 = new Student("Петя", null);
        System.out.printf("%s\n", student2);


        BrokenLine brokenLine = new BrokenLine();
        brokenLine.addPoints(new Point(1,2), new Point(3,4));
        brokenLine.addPoints(new Point[] {new Point(5,6), new Point(7,8)});
        System.out.println(brokenLine);
    }
}
