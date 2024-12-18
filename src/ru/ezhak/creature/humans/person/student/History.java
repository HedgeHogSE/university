package ru.ezhak.creature.humans.person.student;

import java.util.Stack;

public interface History {
    void addChange(Save save);
    Student.SaveStudent removeChange();

    Stack<Student.SaveStudent> getSaves ();


}
