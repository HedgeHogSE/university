package ru.ezhak.reflection.classesWithReflection;

import java.util.Objects;

public class TestB {
    public static void test(B b) {
        if (b.s.equals("hello") && b.text.equals("B") && b.x == 42) {
            return;
        }
        throw new RuntimeException();
    }
}
