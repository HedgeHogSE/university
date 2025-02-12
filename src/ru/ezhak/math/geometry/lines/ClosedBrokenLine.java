package ru.ezhak.math.geometry.lines;

import ru.ezhak.iterator.Iterator;
import ru.ezhak.math.geometry.points.Point2D;

public class ClosedBrokenLine extends BrokenLine {
    public ClosedBrokenLine(Point2D... points) {
        super(points);
        if (points.length <= 2) return;
        if (points[0].equals(points[points.length - 1])) return;
        else addPoints(points[0]);
    }

    public ClosedBrokenLine() {
        super();
    }

    @Override
    public Iterator getIterator() {
        return new ClosedBrokenLineIterator();
    }

    class ClosedBrokenLineIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if (index == points.size()) {
                index = 0;
            }
            return true;
        }

        @Override
        public Object next() {
            hasNext();
            return points.get(index++);
        }
    }
}
