package ru.ezhak.creature.humans.person.karate;

import java.util.ArrayList;
import java.util.List;

public class KarateKid {
    public String name;

    public KarateKid(String name) {
        this.name = name;
    }

    public void jumpKick () {
        System.out.println(name + " : вжух!");
    }

    public void handKick () {
        System.out.println(name + " : кия!");
    }

    public void legKick () {
        System.out.println(name + " : бац!");
    }
}
