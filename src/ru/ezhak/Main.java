package ru.ezhak;

import university.oop.math.geometry.lines.BrokenLine;
import university.oop.math.geometry.lines.Line;
import university.oop.math.geometry.lines.LineOperations;
import university.oop.math.geometry.points.Point;

public class Main {
    public static void main(String[] args) {
        /*Bird[] birds = new Bird[] {new Cuckoo(), new Parrot("Илюшк"), new Sparrow()};
        BirdsSing.sing(birds);
        */

        Line straightLine = new Line(1,2,3,4);
        BrokenLine brokenLine = new BrokenLine(new Point(1,2), new Point(3,4));

        System.out.println(LineOperations.sumLength(straightLine, brokenLine));
    }
}
