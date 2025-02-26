package ru.ezhak.reflection.classesWithReflection;

import ru.ezhak.annotations.Invoke;

public class A extends Entity implements Able{
    String s = "hello";
    int x = 42;
    public static String aaa = "!!!";
    @Invoke

    public String getS() {
        System.out.println(aaa);
        return s;
    }

    public int getX() {
        System.out.println(aaa);
        return x;
    }
}
