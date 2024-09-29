package university.oop.ex1_2;
import university.oop.ex1_1.FullName;

public class Human
{
    public FullName fullName;
    public int height;


    public Human(FullName fullName, int height)
    {
        this.fullName = fullName;
        this.height = height;
    }

    public String toString()
    {
        return fullName + ", рост = " + height;
    }
}
