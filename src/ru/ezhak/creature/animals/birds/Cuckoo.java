package ru.ezhak.creature.animals.birds;

import java.util.Random;

public class Cuckoo extends Bird {
    private String replica = "ку-ку";
    public Cuckoo() {
    }

    @Override
    public void sing() {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(10) + 1; i++) {
            System.out.println(this.replica);
        }
    }

    @Override
    public String toString() {
        return String.format("Кукушка, которая может петь: %s", this.replica);
    }
}
