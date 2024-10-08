package university.oop.ex1_3;

import university.oop.ex1_1.Point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Вася", new int[] {3,4,5});
        Student student2 = new Student("Петя", student1.ratings);
        student2.ratings[0] = 5;
        System.out.printf("%s и %s\n\n", student1, student2);
        Student student3 = new Student("Андрей", Arrays.copyOf(student1.ratings, student1.ratings.length));
        System.out.printf("%s, %s и %s\n\n", student1, student2, student3);


        BrokenLine brokenLine1 = new BrokenLine(new Point[]
                {new Point(1,5), new Point(2,8), new Point(5,3)});
        BrokenLine brokenLine2 = new BrokenLine(new Point[]
                {brokenLine1.points[0], new Point(2,-5), new Point(4,-8), brokenLine1.points[brokenLine1.points.length - 1]});
        brokenLine1.points[0].x = 5;
        brokenLine1.points[0].y = 8;
        System.out.printf("%s и %s\n\n", brokenLine1, brokenLine2);


        City cityA = new City("A"), cityB = new City("B"), cityC = new City("C"),
                cityD = new City("D"), cityE = new City("E"), cityF = new City("F");
        cityA.ways = new Way[] {new Way(cityD, 6), new Way(cityF, 1), new Way(cityB, 5)};
        cityB.ways = new Way[] {new Way(cityA, 5), new Way(cityC, 3)};
        cityC.ways = new Way[] {new Way(cityB, 3), new Way(cityD, 4)};
        cityD.ways = new Way[] {new Way(cityC, 4), new Way(cityE, 2), new Way(cityA, 6)};
        cityE.ways = new Way[] {new Way(cityF, 2)};
        cityF.ways = new Way[] {new Way(cityE, 2), new Way(cityB, 1)};
    }
}
