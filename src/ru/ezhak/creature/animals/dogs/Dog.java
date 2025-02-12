package ru.ezhak.creature.animals.dogs;

public class Dog implements Woofable {
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    public void woof (int times) {
        StringBuilder res = new StringBuilder(name + ": ");
        for (int i=0; i < times; i++)
            res.append("Гав! ");
        System.out.println(res);
    }

    public void woof () {
        woof(1);
    }

    @Override
    public String toString() {
        return "Собака: " + this.name;
    }
}
