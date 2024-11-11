package ru.ezhak.department;

import java.util.ArrayList;

public class Department {
    String name;
    Worker boss;

    final ArrayList<Worker> workers = new ArrayList<>();

    public Department(String name, Worker boss) {
        this.name = name;
        setBoss(boss);
        //this.boss = boss;
        //workers.add(boss);
    }

    public Department(String name) {
        this.name = name;
    }

    /**/public void addWorker(Worker worker) {
        if (workers.contains(worker)) return;
        workers.add(worker);
        worker.department = this;
    }

    /**/public void deleteWorker(Worker worker) {
        if (!workers.contains(worker)) return;
        if (worker == this.boss) this.boss = null;
        workers.remove(worker);
        worker.department = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker getBoss() {
        return boss;
    }

    /**/public void setBoss(Worker boss) {
        if (this.boss == boss) return;
        if (boss != null) {
            addWorker(boss);
        }
        this.boss = boss;
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public String listWorkers () {
        if (this.workers.isEmpty()) return "Нет сотрудников в отделе" + this.name;
        StringBuilder res = new StringBuilder(String.format("В отделе %s: ", this.name));
        for (Worker worker : workers) {
            res.append(worker.name).append(" ");
        }
        return res.toString().trim();
    }

    public String toString() {
        if (this.boss == null)
            return "Отдел " + this.name + " без начальника";
        return this.name/* + " отдел, где начальником является " + this.boss.*/;
    }
}
