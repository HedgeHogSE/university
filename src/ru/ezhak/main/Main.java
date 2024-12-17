package ru.ezhak.main;

import ru.ezhak.math.geometry.lines.BrokenLine;
import ru.ezhak.math.geometry.points.Point2D;
import ru.ezhak.dataStream.DataStream;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        /*List<String> stringList = List.of("qwerty", "asdfg", "zx");
        System.out.println( DataStream.map(stringList, item -> item.length()) );
        System.out.println( DataStream.filter(stringList, item -> item.length() > 2) );
        System.out.println( DataStream.reduce(stringList, (init, cur) -> init + cur, null) );
        System.out.println( DataStream.collect(
            stringList, () -> new HashMap<>(),
            (map, str) -> map.computeIfAbsent(str.length(), k -> new ArrayList<>().add(str))
            )
        );*/
        List<Point2D> pointList = List.of(new Point2D(1,2), new Point2D(-3,-4), new Point2D(5,6));
        /*System.out.println(DataStream.of(pointList)
                .map(point -> new Point2D(point.getX() + 5, point.getY()))
                .filter(point -> point.getX() > 0 && point.getY() > 0)
                .collect(() -> new BrokenLine(), (ds, elem) -> ds.addPoints(elem))
        );*/
        System.out.println(
                DataStream.of(pointList)
                        .map(point -> new Point2D(point.getX() + 5, point.getY()))
                        .filter(point -> point.getX() > 0 && point.getY() > 0)
                        .execute()
        );

    }
}
