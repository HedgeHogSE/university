package university.oop.ex1_3;

import java.util.Arrays;

public class Student {
    public String name;
    public int[] ratings = {};

    public Student (String name, int[] ratings) {
        this.name = name;
        this.ratings = ratings;
    }

    public double average () {
        if (this.ratings == null) return 0;
        int sum = Arrays.stream(this.ratings).sum();
        int count = this.ratings.length;
        return (double) (sum / count);
    }

    public String isExcellentStudent () {
        if (this.average() == 5) return this.name + " - отличник";
        return this.name + " - не отличник";
    }

    @Override
    public String toString() {
        if (ratings == null) return this.name + " без оценок";
        return this.name + ": [" + Arrays.toString(this.ratings) + "]";
    }
}
