package ru.ezhak.creature.humans.person.karate;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Beatable {
    private List<Beatable> combo = new ArrayList<>();

    public void addHit (Beatable b) {
        combo.add(b);
    }

    public void removeAll () {
        combo.removeAll(combo);
    }


    @Override
    public void hit(KarateKid karateKid) {
        for (Beatable b : combo) {
            b.hit(karateKid);
        }
    }
}
