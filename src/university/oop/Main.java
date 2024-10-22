package university.oop;

import university.oop.livingBeing.humans.person.Worker;
import university.oop.premises.Department;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Sasha");
        System.out.println(worker1);
        Department itCompany = new Department("ItCompany", worker1);
        System.out.println(itCompany);
        System.out.println(itCompany.listWorkers());

        Worker worker2 = new Worker("Vanya");
        //worker2.setDepartment(itCompany);
        itCompany.addWorker(worker2);
        System.out.println(itCompany.listWorkers());
        System.out.println(worker2.getDepartment());
        itCompany.deleteWorker(worker2);
        System.out.println(itCompany.listWorkers());
        System.out.println(worker2.getDepartment());

        Worker worker3 = new Worker("Danil");
        Worker worker4 = new Worker("Ramzan");
        Worker worker5 = new Worker("Pavel");
    }
}
