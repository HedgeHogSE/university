package ru.ezhak.creature.animals.cats;

public class Cat implements Meowable {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow () {
        System.out.printf("%s: Мяу!\n", this.name);
    }

    public void meow (int quantityMeow) {
        if (quantityMeow == 0) {
            System.out.printf("%s не мяукает :(", this.name);
            return;
        } else if (quantityMeow == 1) {
            meow();
        }

        quantityMeow -= 1;
        String result = "Мяу-";
        for (int i = 0; i < quantityMeow; i++) {
            if (i + 1 == quantityMeow) result += "мяу!";
            else result += "мяу-";
        }
        System.out.printf("%s: %s\n", this.name, result);
    }
}
