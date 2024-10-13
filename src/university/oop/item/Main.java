package university.oop.item;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun(3,7);
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.reloading(8);
        gun.shot();
        gun.shot();
        gun.unloading();
        gun.shot();
    }
}
