package university.oop.livingBeing.animals;

public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public void sayMeow () {
        System.out.printf("%s: Мяу!\n", this.name);
    }

    public void sayMeow (int quantityMeow) {
        if (quantityMeow == 0) {
            System.out.printf("%s не мяукает :(", this.name);
            return;
        } else if (quantityMeow == 1) {
            sayMeow();
        }

        quantityMeow -= 1;
        String result = "Мяу-";
        for (int i = 0; i < quantityMeow; i++) {
            if (i + 1 == quantityMeow) result += "мяу!";
            else result += "мяу-";
        }
        System.out.printf("%s: %s", this.name, result);
    }
}
