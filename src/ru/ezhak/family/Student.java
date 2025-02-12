package ru.ezhak.family;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    private List<Integer> marks = new ArrayList<>();
    private final Parent parent;


    public Student(String name, Parent parent) {
        this.name = name;
        this.parent = parent;
    }

    public void addMark (int mark) {
        marks.add(mark);
        parent.reaction(this);
    }

    public List<Integer> getMarks() {
        return marks;
    }
}
