package ru.ezhak.dataStructure;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private final List<Object> list = new ArrayList<>();

    public void push (Object element) {
        list.add(element);
    }

    public Object pop () {
        return list.removeLast();
    }

    public Object peek () {
        return list.getLast();
    }
}
