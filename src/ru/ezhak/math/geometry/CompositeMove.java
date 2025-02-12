package ru.ezhak.math.geometry;

import java.util.ArrayList;
import java.util.List;

public class CompositeMove implements Movable {
    List<Movable> movables = new ArrayList<>();

    public void add (Movable movable) {
        movables.add(movable);
    }

    public void remove (Movable movable) {
        movables.remove(movable);
    }

    @Override
    public void shift(String coordinate, int step) {
        for (Movable movable : movables) {
            movable.shift(coordinate, step);
        }
    }
}
