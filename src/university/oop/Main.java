package university.oop;

import university.oop.city.City;
import university.oop.city.Way;
import university.oop.livingBeing.humans.person.Worker;
import university.oop.premises.Department;
import university.oop.weapon.Machine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine(30, 3);
        machine.reloading(30);
        machine.rapidFire(11);
        System.out.println(machine.getQuantityCartridges());
        machine.reloading(6);
        machine.shot();
        machine.shot();
    }
}
