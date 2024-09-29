package university.oop.ex1_2;
import university.oop.ex1_1.FullName;

public class Human
{
    public FullName fullName;
    public int height;

    Human father;

    public Human(FullName fullName, int height) {
        this.fullName = fullName;
        this.height = height;
    }
    public Human(FullName fullName, int height, Human father) {
        this.fullName = fullName;
        this.father = father;
        if (this.fullName.surname == null) this.fullName.surname = this.father.fullName.surname;
        if (this.fullName.patronymic == null) this.fullName.patronymic = this.father.fullName.name + "ович";
        this.height = height;
    }

    public String toString()
    {
        return fullName + ", рост = " + height;
    }
}
