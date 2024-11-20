package ru.ezhak.main;

import ru.ezhak.city.City;
import ru.ezhak.city.CityTwoWay;
import ru.ezhak.city.Way;
import ru.ezhak.department.Department;
import ru.ezhak.department.Worker;
import ru.ezhak.math.geometry.lines.BrokenLine;
import ru.ezhak.math.geometry.lines.ClosedBrokenLine;
import ru.ezhak.math.geometry.lines.Line;
import ru.ezhak.math.geometry.lines.LineOperations;
import ru.ezhak.math.geometry.points.Point;
import ru.ezhak.math.mathematicalOperations.Fraction;
import ru.ezhak.math.mathematicalOperations.MathOperations;
import ru.ezhak.weapon.Gun;
import ru.ezhak.weapon.Machine;
import ru.ezhak.weapon.Shooter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*Department department = new Department("IT");
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
        System.out.printf("%d) %s -- %s\n", i++, department, bossWorker);*/


        /*Shooter shooter = new Shooter("Garry");
        shooter.shoot();
        shooter.setWeapon(new Gun(2,5));
        shooter.shoot();*/


        /*BrokenLine brokenLine = new BrokenLine(new Point(1,2), new Point(3,4), new Point(5,6), new Point(7,8));
        BrokenLine brokenLine2 = new BrokenLine(new Point(1,2), new Point(3,4), new Point(5,6), new Point(7,8));
        System.out.println(brokenLine.equals(brokenLine2));*/

//        City cityB = new City("B");
//        City cityC = new City("C");
//        City cityD = new City("D");
//        ArrayList<Way> ways = new ArrayList<>(List.of(new Way(cityB, 5),new Way(cityC, 5),new Way(cityD, 5)));
//        City cityA = new City("A", ways);
//        CityTwoWay cityTwoWayA = new CityTwoWay("A", ways);
//        System.out.println(cityA.equals(cityTwoWayA));
//        System.out.println(cityA.hashCode());
//        System.out.println(cityTwoWayA.hashCode());

        /*Line line1 = new Line(1,2,3,4);
        Line line2 = new Line(1,2,3,4);
        Line line3 = new Line(3,4,1,2);
        System.out.println(line1.equals(line3));
        System.out.println(line1.hashCode());
        System.out.println(line3.hashCode());*/

        /*Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);

        ClosedBrokenLine closedBrokenLine1 = new ClosedBrokenLine(p1,p2,p3);
        ClosedBrokenLine closedBrokenLine2 = new ClosedBrokenLine(p1,p2,p3);

        BrokenLine brokenLine1 = new BrokenLine(p1,p2,p3,p1);
        BrokenLine brokenLine2 = new BrokenLine(p1,p2,p3,p1);

        System.out.println(brokenLine1.equals(brokenLine2));
        System.out.println(closedBrokenLine1.equals(closedBrokenLine1));

        System.out.println(closedBrokenLine1.equals(brokenLine1));
        System.out.println(brokenLine1.equals(closedBrokenLine1));*/

        Fraction fraction1 = new Fraction(5, 10);

        // Клонируем объект
        Fraction fraction2 = (Fraction) fraction1.clone();
    }
}
