package ru.ezhak.main;

import ru.ezhak.department.Department;
import ru.ezhak.department.Worker;
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

        /*Point point = new Point(1,2);
        java.awt.Point point1 = new java.awt.Point(1,2);

        System.out.printf("%s, %s", point, point1);*/

        Department department = new Department("IT");
        Worker bossWorker = new Worker("Alex");
        department.setBoss(bossWorker);
        int i = 1;
        System.out.printf("%d) %s -- %s\n", i++, department, bossWorker);

        System.out.println();

        bossWorker.setDepartment(null);
        System.out.printf("%d) %s -- %s\n", i++, department, bossWorker);

        System.out.println();

        department.setBoss(bossWorker);
        System.out.printf("%d) %s -- %s\n", i++, department, bossWorker);
        department.deleteWorker(bossWorker);
        System.out.printf("%d) %s -- %s\n", i++, department, bossWorker);
        department.setBoss(bossWorker);

        System.out.println();

        Worker worker = new Worker("Petya");
        department.addWorker(worker);
        System.out.printf("%d) %s\n", i++, department.getWorkers());
        department.deleteWorker(worker);
        System.out.printf("%d) %s\n", i++, department.getWorkers());
        department.deleteWorker(bossWorker);
        System.out.printf("%d) %s -- %s\n", i++, department, bossWorker);
    }
}
