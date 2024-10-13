package lessonsOnYoutube.new_oop.Interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Михаил");
        Cooker cooker = new Cooker("Екатерина");
        Driver driver = new Driver("Райан");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(programmer);
        employees.add(driver);
        employees.add(cooker);
        for (Employee employee : employees){
            employee.voice();
        }
        cooker.canCook();
        driver.canDrive();
        programmer.canCoding();
    }
}
