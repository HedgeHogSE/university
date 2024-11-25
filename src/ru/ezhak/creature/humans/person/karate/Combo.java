package ru.ezhak.creature.humans.person.karate;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Beatable{

    public List<Beatable> beatables = new ArrayList<>();

    public void hit (KarateKid karateKid) {
        for (Beatable beatable : beatables) {
            beatable.hit(karateKid);
        }
    }
}
