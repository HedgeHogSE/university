package ru.ezhak.creature.animals.birds;

import java.util.Random;

public class Parrot extends Bird {
    private String replica;
    public Parrot (String replica) {
        this.replica = replica;
    }

    public String getReplica() {
        return replica;
    }

    public void setReplica(String replica) {
        this.replica = replica;
    }

    @Override
    public void sing() {
        Random random = new Random();
        int lineSing = random.nextInt(replica.length()) + 1;
        System.out.println(this.replica.substring(0, lineSing) );
    }

    @Override
    public String toString() {
        return String.format("Попугай, который может петь: %s", this.replica);
    }
}
