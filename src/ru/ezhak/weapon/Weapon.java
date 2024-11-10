package ru.ezhak.weapon;

public abstract class Weapon {
    private int ammo;
    public Weapon (int ammo) {
        if (ammo < 0) throw new RuntimeException();
        this.ammo = ammo;
    }

    abstract void shoot ();
    public int ammo () {
        return ammo;
    }
    public boolean useAmmo() {
        if (ammo == 0) return false;
        ammo--;
        return true;
    }
    public int load(int ammo) {
        if (ammo < 0) throw new RuntimeException();
        this.ammo = ammo;
        return ammo;
    }
}
