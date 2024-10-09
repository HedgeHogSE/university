package university.oop.ex1_3;

import university.oop.ex1_1.Point;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Вася", new int[] {3,4,5});
        System.out.printf("%s\n", student1.isExcellentStudent());
        Student student2 = new Student("Петя");
        System.out.printf("%s\n", student2.isExcellentStudent());
        Student student3 = new Student("Петя2", new int[] {5,5,5});
        System.out.printf("%s\n", student3.isExcellentStudent());
        Student student = new Student("Санёк", new int[] {5,5,5});
        System.out.println(student);


        BrokenLine brokenLine = new BrokenLine();
        brokenLine.addPoints(new Point(1,2), new Point(3,4));

        brokenLine.addPoints(new Point[] {new Point(5,6), new Point(7,8)});
        System.out.println(brokenLine);
    }
}
