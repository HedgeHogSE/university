package ru.ezhak.creature.humans.person.karate;

public class JumpKick implements Beatable {
    public KarateKid karateKid;
    public JumpKick(KarateKid karateKid) {
        this.karateKid = karateKid;
    }

    @Override
    public void hit() {
        karateKid.jumpKick();
    }
}
