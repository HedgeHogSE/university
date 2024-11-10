package ru.ezhak.math.geometry.lines;

public class LineOperations {
    public static int sumLength (LineSegment... lines) {
        int res = 0;
        for (LineSegment line : lines) {
            res += line.length();
        }
        return res;
    }
}
