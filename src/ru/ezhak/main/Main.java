package ru.ezhak.main;

import ru.ezhak.creature.humans.person.student.History;
//import ru.ezhak.creature.humans.person.student.HistoryStudent;
import ru.ezhak.creature.humans.person.student.Save;
import ru.ezhak.creature.humans.person.student.Student;
import ru.ezhak.math.geometry.lines.BrokenLine;
import ru.ezhak.math.geometry.points.Point2D;
import ru.ezhak.dataStream.DataStream;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("beb", 5,4,3);
        History history = student.history();
        System.out.println("1: " + student);

        student.addGrades(4);
        history.addChange(student.save());

        student.addGrades(5);
        history.addChange(student.save());

        student.name = "AAA";
        history.addChange(student.save());
        System.out.println("2: " + student);

        System.out.println(history.getSaves());

        student.rollback(history.removeChange());
        System.out.println("3: " + student);

        student.rollback(history.removeChange());
        System.out.println("4: " + student);

        student.rollback(history.removeChange());
        System.out.println("5: " + student);

    }
}
