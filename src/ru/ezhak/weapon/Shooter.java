package ru.ezhak.weapon;

public class Shooter {
    private String name;
    private Weapon weapon;

    public Shooter(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public Shooter(String name) {
        this.name = name;
    }

    public void shoot(){
        if (weapon == null){
            System.out.println("Я не могу стрелять");
            return;
        }
        weapon.shoot();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        if (weapon == null) return null;
        return weapon.clone();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
