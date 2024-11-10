package ru.ezhak.creature.animals.birds;

public class BirdsSing {
    public static void sing (Bird... birdList) {
        for (Bird bird : birdList) {
            bird.sing();
        }
    }
}
