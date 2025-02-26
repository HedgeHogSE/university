package ru.ezhak.main;


import ru.ezhak.creature.animals.cats.Cat;
import ru.ezhak.creature.animals.cats.Meowable;
import ru.ezhak.reflection.classesWithReflection.A;
import ru.ezhak.reflection.classesWithReflection.Able;
import ru.ezhak.reflection.reflectionUtils.ReflectionUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Able a = ReflectionUtils.cache(new A());
        String s = a.getS();
        System.out.println(s);
        String s1 = a.getS();
        System.out.println(s1);
        String s2 = a.getS();
        System.out.println(s2);
        String s3 = a.getS();
        System.out.println(s3);


    }
}
