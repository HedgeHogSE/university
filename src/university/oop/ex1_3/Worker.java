package university.oop.ex1_3;

public class Worker {
    public String surname;
    public Department department;

    public Worker(String surname) {
        this.surname = surname;
    }

    public void setDepartment(Department department) {
        this.department = department;
        this.department.addWorker(this);
    }

    public String showWorkers() {
        String res = "";
        for (int i = 0; i < department.currentCountWorkers; i++)
            res += department.workers[i].surname + " ";
        return res;
    }

    public String toString() {
        if (department == null)
            return surname + " doesn't work in someone department";
        if (department.boss == this)
            return surname + " is the boss of " + department.name + " department";
        return surname + " works in " + department;
    }
}