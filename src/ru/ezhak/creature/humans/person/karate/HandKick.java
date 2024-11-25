package ru.ezhak.creature.humans.person.karate;

public class HandKick implements Beatable {

    static int countHandKick = 0;

    public HandKick() {
        countHandKick++;
        if (countHandKick > 1) throw new RuntimeException("!!!");
    }

    @Override
    public void hit(KarateKid karateKid) {
        karateKid.handKick();
    }
}
