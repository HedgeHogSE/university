/*package ru.ezhak.creature.humans.person.student;

import ru.ezhak.Comparable;

import java.util.*;

public class Student implements Comparable<Student> {
    public String name;
    private int[] grades = {};

    public Student (String name, int... grades) {
        this.name = name;
        addGrades(grades);
    }

    public Save save () {
        return new SaveStudent();
    }

    public HistoryStudent history () {
        return new HistoryStudent(save());
    }

    public void rollback (SaveStudent student) {

        this.name = student.name;
        this.grades = student.grades.clone();
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Arrays.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(grades);
        return result;
    }
    @Override
    public int compare(Student student) {
        double thisAvg = this.average();
        double studentAvg = student.average();
        if (thisAvg > studentAvg) return 1;
        else if (thisAvg == studentAvg) return 0;
        return -1;
    }

    @Override
    public String toString() {
        if (grades == null) return this.name + " без оценок";
        return this.name + ": " + Arrays.toString(this.grades);
    }
    // Класс сохранения студента
    class SaveStudent implements Save{
        public String name;
        private final int[] grades;

        public SaveStudent() {
            this.name = Student.this.name;
            this.grades = Student.this.grades.clone();
        }

        @Override
        public void load() {
            Student.this.grades = this.grades;
            Student.this.name = this.name;
        }

        @Override
        public String toString() {
            if (grades == null) return this.name + " без оценок";
            return this.name + ": " + Arrays.toString(this.grades);
        }
    }

    public class HistoryStudent implements History{
        public final List<SaveStudent> saves = new ArrayList<>();

        public HistoryStudent(Save save) {
            addChange(save);
        }

        public void addChange(Save save) {
            saves.add((Student.SaveStudent) save);
        }

        public Student.SaveStudent removeChange() {
            saves.removeLast();
            return saves.getLast();
        }

        @Override
        public List<SaveStudent> getSaves() {
            return saves;
        }
    }
}
*/