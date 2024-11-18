package ru.ezhak.weapon;

public abstract class Weapon implements Cloneable{
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

    @Override
    public Weapon clone() {
        try {
            Weapon clone = (Weapon) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
