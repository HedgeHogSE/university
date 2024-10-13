package lessonsOnYoutube.new_oop.Interface;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voice(){
        System.out.println(name);
    }
}
