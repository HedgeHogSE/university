package ru.ezhak.weapon;

public class Machine extends Gun{

    private int rateOfFire = 30;


    public Machine(int maxAmmoCount, int rateOfFire) {
        super(maxAmmoCount);
        this.rateOfFire = Math.max(rateOfFire, 0);
    }

    public Machine(int maxAmmoCount) {
        this(maxAmmoCount, maxAmmoCount / 2);
    }

    public Machine() {
        super(30);
    }

    private void cyclicTextOutput (int repeat, String text) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(text);
        }
    }

    @Override
    public void shoot() {
        if (this.ammo() < 0) {
            System.out.println("Клац(");
            return;
        }
        if (this.ammo() >= this.rateOfFire) {
            cyclicTextOutput(this.rateOfFire, "Бах!");
            this.load(this.ammo() - this.rateOfFire);
        } else {
            cyclicTextOutput(this.ammo(), "Бах!");
            cyclicTextOutput(this.rateOfFire - this.ammo(), "Клац(");
            this.load(0);
        }
    }

    public void rapidFire (int sec) {
        for (int i = 0; i < sec; i++) {
            shoot();
        }
    }

    @Override
    public String toString() {
        return "Machine{" +
                "rateOfFire=" + rateOfFire +
                ", maxAmmoCount=" + maxAmmoCount +
                '}';
    }
}
