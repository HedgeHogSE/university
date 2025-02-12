package ru.ezhak.creature.humans.person.karate;

public class BeatHand implements Beatable {
    private static final BeatHand beatHand = new BeatHand();

    private BeatHand() {
    }

    public static BeatHand createBitHand () {
        return beatHand;
    }

    @Override
    public void hit(KarateKid karateKid) {
        karateKid.beatHand();
    }
}
