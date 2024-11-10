package ru.ezhak.creature.animals.cats;

public abstract class CanMeow {
    public void meow (Meowable... canMeows) {
        for (Meowable cat : canMeows) {
            cat.meow();
        }
    }
}
