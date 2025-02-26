package ru.ezhak.reflection.tests;

import ru.ezhak.reflection.classesWithReflection.B;

public class TestsB {
    private static final B b = new B();

    public void test1() {
        if (b.getS().equals("hello")) {
            return;
        }
        throw new ValidateException("test1 не пройден");
    }

    public void test2() {
        if (b.getText().equals("B")) {
            return;
        }
        throw new ValidateException("test2 не пройден");
    }

    public void test3 () {
        if (b.getX() == 42) {
            return;
        }
        throw new ValidateException("test3 не пройден");
    }
}
