package new_oop.Interface;

public class Cooker extends Employee implements CanCook{
    public Cooker(String name){
        super(name);
    }
    public void canCook(){
        System.out.println("Готовлю еду");
    }
}
