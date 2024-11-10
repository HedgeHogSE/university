package ru.ezhak.creature.humans.person;

import ru.ezhak.premises.Department;

import java.util.ArrayList;

public class Worker {
    private String name;
    private Department department;

    public Worker(String name) {
        this.name = name;
    }

    public String showColleaguesAsString () {
        if (department == null) {
            return String.format("Работник %s не привязан к отделу", this.name);
        }
        StringBuilder res = new StringBuilder(String.format("Коллеги у %s в отделе %s: ", this.name, department.getName()));
        for (Worker worker : department.getWorkers()) {
            res.append(worker.name).append(" ");
        }

        return res.toString().trim();
    }

    public Worker[] showColleaguesAsArray () {

        return new ArrayList<>(department.getWorkers()).toArray(new Worker[0]);
    }

    public void setDepartment(Department department) {
        if (department == this.department) return;
        if (this.department == null) {
            this.department = department;
            this.department.addWorker(this);
        } else {
            this.department.deleteWorker(this);
            this.department = department;
        }
    }

    public Department getDepartment() {
        return new Department(this.department.getName(), this.department.getBoss());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (department == null) {
            return "Работник " + name + " не работает ни в каком отделе";
        } else if (department.getBoss() == this) {
            return String.format("Начальник %s работает в %s", name, department);
        } else {
            return String.format("Работник %s работает в %s, у которого начальник %s", name, department, department.getBoss());
        }

    }
}