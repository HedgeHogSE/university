package university.oop.item;

public class Gun {
    private int quantityCartridges;
    private final int maxAmmoCount;
    public Gun (int quantityCartridges, int maxAmmoCount) {
        this.maxAmmoCount = maxAmmoCount;
        this.quantityCartridges = Math.min(this.maxAmmoCount, quantityCartridges);
    }

    public Gun(int maxAmmoCount) {
        this(5, maxAmmoCount);
    }

    public void shot () {
        if (this.quantityCartridges > 0) {
            System.out.println("Бах!");
            this.quantityCartridges--;
        } else System.out.println("Клац(");
    }

    public int reloading (int cartridges) {
        if (this.quantityCartridges + cartridges > this.maxAmmoCount) {
            this.quantityCartridges = this.maxAmmoCount;
            return this.quantityCartridges + cartridges - this.maxAmmoCount;
        } else {
            this.quantityCartridges += cartridges;
            return 0;
        }
    }

    public int unloading () {
        int res = this.quantityCartridges;
        this.quantityCartridges = 0;
        return res;
    }

    public int getMaxAmmoCount() {
        return maxAmmoCount;
    }

    public int getQuantityCartridges() {
        return quantityCartridges;
    }

    public boolean isEmpty () {
        return getQuantityCartridges() == 0;
    }
}
