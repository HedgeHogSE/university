package ru.ezhak.storage;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private T ob;

    public Box(T ob){
        this.ob = ob;
    }

    public Box() {
    }

    public boolean isEmpty() {
        return ob == null;
    }

    public static double maxValue (Box<?>... boxes) {
        List<Box<?>> boxes1 = new ArrayList<>(List.of(boxes));
        double res = 0;
        for (Box<?> box : boxes1) {
            Object o = box.popObject();
            if (o instanceof Number) {
                if ( res < ((Number) o).doubleValue() ) res = ((Number) o).doubleValue();
            }
        }
        return res;
    }

    public T popObject() {
        T copyOb = ob;
        ob = null;
        return copyOb;
    }

    public void pushObject(T ob) {
        if (!this.isEmpty()) throw new RuntimeException();
        this.ob = ob;
    }
}
