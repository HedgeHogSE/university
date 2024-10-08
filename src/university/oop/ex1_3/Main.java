package university.oop.ex1_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Вася", new int[] {3,4,5});
        Student student2 = new Student("Петя", Arrays.copyOf(student1.ratings, student1.ratings.length));
        student2.ratings[0] = 5;
        System.out.printf("%s и %s", student1, student2);
        Student student3 = new Student("Андрей", Arrays.copyOf(student1.ratings, student1.ratings.length));
    }
}
