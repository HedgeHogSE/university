package ru.ezhak.main;

import ru.ezhak.box.Storage;
import ru.ezhak.city.City;
import ru.ezhak.city.CityTwoWay;
import ru.ezhak.city.Way;
import ru.ezhak.creature.animals.cats.Cat;
import ru.ezhak.creature.animals.cats.CountMeow;
import ru.ezhak.creature.animals.cats.MeowNews;
import ru.ezhak.creature.animals.cats.Tester;
import ru.ezhak.creature.humans.person.karate.*;
import ru.ezhak.dataStructure.Stack;
import ru.ezhak.department.Department;
import ru.ezhak.department.Worker;
import ru.ezhak.math.geometry.lines.BrokenLine;
import ru.ezhak.math.geometry.lines.ClosedBrokenLine;
import ru.ezhak.math.geometry.lines.Line;
import ru.ezhak.math.geometry.lines.LineOperations;
import ru.ezhak.math.geometry.points.Point;
import ru.ezhak.math.mathematicalOperations.Fraction;
import ru.ezhak.math.mathematicalOperations.MathOperations;
import ru.ezhak.weapon.Gun;
import ru.ezhak.weapon.Machine;
import ru.ezhak.weapon.Shooter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*Storage<Integer> storage = new Storage<>(null, Integer.class);
        System.out.println(storage.getOb());*/

        Stack stack = new Stack();
        stack.push(11);
        System.out.println(stack.peek());
        stack.push("string");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
