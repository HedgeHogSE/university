package ru.ezhak.creature.humans.person.karate;

public class BeatJump implements Beatable {
    private static final BeatJump beatJump = new BeatJump();

    private BeatJump() {
    }

    public static BeatJump createBitJump () {
        return beatJump;
    }

    @Override
    public void hit(KarateKid karateKid) {
        karateKid.beatJump();
    }
}
