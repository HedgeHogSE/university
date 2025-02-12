package ru.ezhak.creature.humans.person.karate;

public class BeatLeg implements Beatable {
    private static final BeatLeg beatLeg = new BeatLeg();

    private BeatLeg() {
    }

    public static BeatLeg createBitLeg () {
        return beatLeg;
    }

    @Override
    public void hit(KarateKid karateKid) {
        karateKid.beatLeg();
    }
}
