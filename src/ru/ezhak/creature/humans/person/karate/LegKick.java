package ru.ezhak.creature.humans.person.karate;

public class LegKick implements Beatable {

    @Override
    public void hit(KarateKid karateKid) {
        karateKid.legKick();
    }
}
