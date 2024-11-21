package ru.ezhak.creature.animals.cats;

public class CountMeow implements Meowable{
    Meowable m;
    public int count = 0;

    public CountMeow(Meowable m) {
        this.m = m;
    }

    @Override
    public void meow() {
        m.meow();
        count++;
    }
}
