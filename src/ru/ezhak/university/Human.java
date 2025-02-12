package ru.ezhak.university;

public abstract class Human {
    protected final String name;

    protected Human(String name) {
        this.name = name;
    }

    public boolean checkUser() {
        return false;
    }

    public String getName() {
        return name;
    }
}
