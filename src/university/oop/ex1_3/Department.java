package university.oop.ex1_3;

import java.util.Arrays;

public class Department {
    public String name;
    public Worker boss;

    private int maxQuantityWorkers = 1;
    public Worker[] workers = new Worker[maxQuantityWorkers];
    public int currentCountWorkers = 0;

    public Department(String name, Worker boss) {
        this.name = name;
        this.boss = boss;
    }

    private Worker[] expandWorkers(Worker [] workers) {
        maxQuantityWorkers *= 2;

        return Arrays.copyOf(workers, workers.length);
    }

    public void addWorker(Worker worker) {
        if (currentCountWorkers == maxQuantityWorkers)
            workers = expandWorkers(workers);

        workers[currentCountWorkers++] = worker;
    }

    public String toString() {
        if (this.boss == null)
            return this.name + " department without chief";
        return this.name + " department, his chief " + this.boss.surname;
    }
}
