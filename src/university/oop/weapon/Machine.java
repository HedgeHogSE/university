package university.oop.weapon;

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
    public void shot() {
        if (this.quantityCartridges < 0) {
            System.out.println("Клац(");
            return;
        }
        if (this.quantityCartridges >= this.rateOfFire) {
            cyclicTextOutput(this.rateOfFire, "Бах!");
            this.quantityCartridges -= this.rateOfFire;
        } else {
            cyclicTextOutput(this.quantityCartridges, "Бах!");
            cyclicTextOutput(this.rateOfFire - this.quantityCartridges, "Клац(");
            this.quantityCartridges = 0;
        }
    }

    public void rapidFire (int sec) {
        for (int i = 0; i < sec; i++) {
            shot();
        }
    }
}
