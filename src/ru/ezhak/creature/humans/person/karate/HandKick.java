package ru.ezhak.creature.humans.person.karate;

public class HandKick implements Beatable {
    public KarateKid karateKid;
    public HandKick(KarateKid karateKid) {
        this.karateKid = karateKid;
    }

    @Override
    public void hit() {
        karateKid.handKick();
    }
}
