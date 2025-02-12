package ru.ezhak.creature.humans.person.karate;

public class KarateKid {
    private final String name;
    private Combo combo = new Combo();

    public KarateKid(String name) {
        this.name = name;
    }

    public void beatHand () {
        System.out.println(name + ": Бац!");
    }

    public void beatLeg() {
        System.out.println(name + ": Кия!");
    }

    public void beatJump() {
        System.out.println(name + ": Вжух!");
    }

    public void addHitInCombo (Beatable b) {
        combo.addHit(b);
    }

    public void removeAllWithCombo () {
        combo.removeAll();
    }

    public void executeCombo() {
        combo.hit(this);
    }
}
