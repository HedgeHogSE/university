package ru.ezhak.creature.animals.cats;

public class MeowNews implements Meowable {
    Meowable m;

    public MeowNews(Meowable m) {
        this.m = m;
    }

    @Override
    public void meow() {
        System.out.println("ВНИМАНИЕ!");
        m.meow();
    }
}
