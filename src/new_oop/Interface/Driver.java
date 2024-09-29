package new_oop.Interface;

public class Driver extends Employee implements CanDrive{
    public Driver(String name) {
        super(name);
    }

    @Override
    public void canDrive() {
        System.out.println("Вожу машину");
    }
}
