package ru.ezhak.main;
import ru.ezhak.math.geometry.lines.BrokenLine;
import ru.ezhak.math.geometry.lines.Line;
import ru.ezhak.math.geometry.points.Point2D;
import ru.ezhak.math.geometry.points.Point3D;
import ru.ezhak.reflection.classesWithReflection.A;
import ru.ezhak.reflection.classesWithReflection.B;
import ru.ezhak.reflection.classesWithReflection.TestB;
import ru.ezhak.reflection.reflectionUtils.ReflectionUtils;
import ru.ezhak.reflection.workWithFile.ObjectsReader;
import ru.ezhak.reflection.workWithFile.ObjectsWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        /*List<String> stringList = new ArrayList<>();
        stringList.add("qqq");
        stringList.add("qwerty");
        stringList.add("b e b");
        stringList.add("ulyxa228");
        stringList.add("kwkw");

        int res = stringList.stream().filter(e->e.startsWith("q")).map(String::length).reduce(0,(a, e)-> a + e);
        System.out.println(res);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        Map<Boolean, List<Integer>> map = integerList.stream().collect(Collectors.partitioningBy(e->e % 2 == 0));
        List<Integer> evenList = map.get(true);
        List<Integer> oddList = map.get(false);
        System.out.println(evenList + ", " + oddList);*/

        Scanner scanner = new Scanner(new File("points.txt"));



        List<Point2D> list = new ArrayList<>();
        list.add(new Point2D(5,2));
        list.add(new Point2D(1,2));
        list.add(new Point2D(1,2));
        list.add(new Point2D(4,-5));

        BrokenLine brokenLine = list.stream()
                .distinct()
                .sorted(Comparator.comparing(Point2D::getX))
                .map(e->new Point2D(e.getX(), Math.abs(e.getY())))
                .collect(BrokenLine::new,
                        (BrokenLine bl, Point2D p) -> bl.getPoints().add(p),
                        (bl, bl2) -> bl.getPoints().addAll(bl2.getPoints())
                        );

        System.out.println(brokenLine);
    }
}
