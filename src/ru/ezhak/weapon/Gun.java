package ru.ezhak.weapon;

public class Gun extends Weapon {
    protected final int maxAmmoCount;
    public Gun (int ammo, int maxAmmoCount) {
        super(ammo);
        this.maxAmmoCount = maxAmmoCount;
    }

    public Gun(int maxAmmoCount) {
        this(5, maxAmmoCount);
    }

    @Override
    public void shoot () {
        if (ammo() > 0) {
            System.out.println("Бах!");
            useAmmo();
        } else System.out.println("Клац(");
    }

    public int reloading (int ammo) {
        if (ammo < 0) throw new RuntimeException("Количество патронов не может быть отрицательным.");
        if (this.ammo() + ammo > this.maxAmmoCount) {
            int copyAmmo = this.ammo();
            load(this.maxAmmoCount);
            return copyAmmo + ammo - this.maxAmmoCount;
        } else {
            load(this.ammo() + ammo);
            return 0;
        }
    }

    public int unloading () {
        int res = ammo();
        load(0);
        return res;
    }

    public int getMaxAmmoCount() {
        return maxAmmoCount;
    }

    public boolean isEmpty () {
        return ammo() == 0;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "maxAmmoCount=" + maxAmmoCount +
                '}';
    }
}
