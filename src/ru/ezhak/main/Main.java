package ru.ezhak.main;

import ru.ezhak.dataStructure.Stack;
import ru.ezhak.math.geometry.lines.Line;
import ru.ezhak.math.geometry.points.Point2D;
import ru.ezhak.math.geometry.points.Point3D;
import ru.ezhak.storage.Box;

import static ru.ezhak.math.geometry.lines.Line.shift;


public class Main {
    public static void main(String[] args) {
        /*Line<Point3D> line = new Line<>(new Point3D(1,2,4), new Point3D(7,9,12));
        Line<Point2D> line2 = new Line<>(new Point2D(1,2), new Point2D(3,4));
        Line.shift(line);
        Line.shift(line2);
        System.out.println(line.getPoint1());
        System.out.println(line2.getPoint1());*/

        /*Box<Double> box = new Box<>(1.2);
        Box<Double> box2 = new Box<>(2.3);
        Box<Integer> box3 = new Box<>(3);
        System.out.println(Box.maxValue(box,box2,box3));*/

        Box<Point2D> box = new Box<>();
        box.pushObject(new Point2D(1,2));
        System.out.println(box.popObject().getClass());
        Point3D.putInBox(box, new Point3D(1,2,3));
        System.out.println(box.popObject().getClass());

    }
}
