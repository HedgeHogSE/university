package ru.ezhak.creature.humans.person;

import java.util.Arrays;

public class Student {
    public String name;
    private int[] grades = {};

    public Student (String name, int... grades) {
        this.name = name;
        addGrades(grades);
    }

    public double average () {
        if (this.grades == null) return 0;
        int sum = Arrays.stream(this.grades).sum();
        int count = this.grades.length;
        if (count == 0) return 0;
        return (double) sum / count;
    }

    public boolean isExcellentStudent () {
        return (this.average() == 5);
    }

    public void addGrades (int... grades) {
        for (int grade : grades) {
            if (grade > 5 || grade < 2) return;
        }
        int[] copyGrades = new int[this.grades.length + grades.length];
        System.arraycopy(this.grades, 0, copyGrades, 0, this.grades.length);
        System.arraycopy(grades, 0, copyGrades, this.grades.length, grades.length);
        this.grades = copyGrades;
    }

    public int[] getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        if (grades == null) return this.name + " без оценок";
        return this.name + ": " + Arrays.toString(this.grades);
    }
}
