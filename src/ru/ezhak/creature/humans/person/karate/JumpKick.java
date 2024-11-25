package ru.ezhak.creature.humans.person.karate;

public class JumpKick implements Beatable {

    @Override
    public void hit(KarateKid karateKid) {
        karateKid.jumpKick();
    }
}
