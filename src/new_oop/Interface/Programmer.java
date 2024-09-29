package new_oop.Interface;

public class Programmer extends Employee implements CanCoding{
    public Programmer(String name) {
        super(name);
    }
    public void canCoding(){
        System.out.println("Пишу код");
    }
}
