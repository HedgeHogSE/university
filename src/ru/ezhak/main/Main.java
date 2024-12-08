package ru.ezhak.main;

import ru.ezhak.dataStructure.Stack;
import ru.ezhak.math.geometry.lines.Line;
import ru.ezhak.math.geometry.points.Point2D;
import ru.ezhak.math.geometry.points.Point3D;
import ru.ezhak.methods.Methods;
import ru.ezhak.storage.Box;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static ru.ezhak.math.geometry.lines.Line.shift;


public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("qwerty", "asdfg", "zx");
        System.out.println( Methods.map(stringList, item -> item.length()) );
        System.out.println( Methods.filter(stringList, item -> item.length() > 2) );
        System.out.println( Methods.reduce(stringList, (init, cur) -> init + cur, null) );
        System.out.println( Methods.processList(
            stringList, () -> new HashMap<>(),
            (map, str) -> map.computeIfAbsent(str.length(), k -> new ArrayList<>().add(str))
            )
        );

    }
}
