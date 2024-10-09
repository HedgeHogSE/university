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


    public String toString() {
        String res = "";
        for (int i = 0; i < department.currentCountWorkers; i++)
            res += department.workers[i].surname + " ";
        return res;
    }
}