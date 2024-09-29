package university.oop.ex1_1;

public class Human {
    private String name;
    private int age;
    public Human (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String aboutHuman() {
        return String.format("%s, рост %d", this.name, this.age);
    }
}
