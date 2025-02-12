package ru.ezhak.creature.animals.сatDogs;

import ru.ezhak.creature.animals.cats.Cat;
import ru.ezhak.creature.animals.cats.Meowable;
import ru.ezhak.creature.animals.dogs.Dog;
import ru.ezhak.creature.animals.dogs.Woofable;

public class CatDog implements Meowable, Woofable {
    private Cat cat;
    private Dog dog;

    public CatDog(String name) {
        cat = new Cat(name);
        dog = new Dog(name);
    }

    @Override
    public void meow() {
        cat.meow();
    }

    @Override
    public void woof() {
        dog.woof();
    }

    @Override
    public String toString() {
        return "Котопес: " + this.cat.name;
    }
}
