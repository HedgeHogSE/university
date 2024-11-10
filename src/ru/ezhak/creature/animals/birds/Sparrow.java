package ru.ezhak.creature.animals.birds;

public class Sparrow extends Bird {
    public String replica = "Чирик";
    public Sparrow() {
    }

    @Override
    public void sing() {
        System.out.println(this.replica);
    }

    @Override
    public String toString() {
        return String.format("Воробей, который может петь: %s", this.replica);
    }
}
