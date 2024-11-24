package ru.ezhak.creature.humans.person.karate;

public class LegKick implements Beatable {
    public KarateKid karateKid;
    public LegKick(KarateKid karateKid) {
        this.karateKid = karateKid;
    }

    @Override
    public void hit() {
        karateKid.legKick();
    }
}
