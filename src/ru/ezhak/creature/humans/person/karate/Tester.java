package ru.ezhak.creature.humans.person.karate;

public class Tester {
    public LegKick legKick;
    public HandKick handKick;
    public JumpKick jumpKick;

    public Tester(LegKick legKick, HandKick handKick, JumpKick jumpKick) {
        this.legKick = legKick;
        this.handKick = handKick;
        this.jumpKick = jumpKick;
    }

    public void legHit () {
        legKick.hit();
    }

    public void handHit () {
        handKick.hit();
    }

    public void jumpHit () {
        jumpKick.hit();
    }
}
