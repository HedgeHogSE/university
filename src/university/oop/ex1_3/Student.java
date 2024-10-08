package university.oop.ex1_3;

import java.util.Arrays;

public class Student {
    public String name;
    public int[] ratings;

    public Student (String name, int[] ratings) {
        this.name = name;
        this.ratings = ratings;
    }


    @Override
    public String toString() {
        return this.name + ": [" + Arrays.toString(this.ratings) + "]";
    }
}
