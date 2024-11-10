package ru.ezhak.main;

import ru.ezhak.math.geometry.lines.BrokenLine;
import ru.ezhak.math.geometry.lines.Line;
import ru.ezhak.math.geometry.lines.LineOperations;
import ru.ezhak.math.geometry.points.Point;
import ru.ezhak.math.mathematicalOperations.Fraction;
import ru.ezhak.math.mathematicalOperations.MathOperations;

import java.math.BigInteger;



public class Main {
    public static void main(String[] args) {
        /*Bird[] birds = new Bird[] {new Cuckoo(), new Parrot("Илюшк"), new Sparrow()};
        BirdsSing.sing(birds);
        */

        /*Line straightLine = new Line(1,2,3,4);
        BrokenLine brokenLine = new BrokenLine(new Point(1,2), new Point(3,4));

        System.out.println(LineOperations.sumLength(straightLine, brokenLine));*/

        /*System.out.println(MathOperations.sum(
                7,
                new Fraction(11,3),
                3.21,
                new BigInteger("12345678912345678912"))
        );*/

        //System.out.println(MathOperations.expString(args[0], args[1]));

        Point point = new Point(1,2);
        java.awt.Point point1 = new java.awt.Point(1,2);

        System.out.printf("%d, %d", point.getX() + point.getY(), point1.x + point1.y);
    }
}
