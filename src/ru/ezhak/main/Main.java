package ru.ezhak.main;
import ru.ezhak.math.geometry.lines.Line;
import ru.ezhak.math.geometry.points.Point2D;
import ru.ezhak.math.geometry.points.Point3D;
import ru.ezhak.reflection.classesWithReflection.A;
import ru.ezhak.reflection.classesWithReflection.B;
import ru.ezhak.reflection.classesWithReflection.TestB;
import ru.ezhak.reflection.reflectionUtils.ReflectionUtils;
import ru.ezhak.reflection.workWithFile.ObjectsReader;
import ru.ezhak.reflection.workWithFile.ObjectsWriter;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        /*List<String> stringList = new ArrayList<>();
        stringList.add("qqq");
        stringList.add("qwerty");
        stringList.add("b e b");
        stringList.add("ulyxa228");
        stringList.add("kwkw");

        int res = stringList.stream().filter(e->e.startsWith("q")).map(String::length).reduce(0,(a, e)-> a + e);
        System.out.println(res);*/

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        Map<Boolean, List<Integer>> map = integerList.stream().collect(Collectors.partitioningBy(e->e % 2 == 0));
        List<Integer> evenList = map.get(true);
        List<Integer> oddList = map.get(false);
        System.out.println(evenList + ", " + oddList);
    }
}
