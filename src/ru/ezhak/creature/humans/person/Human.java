package ru.ezhak.creature.humans.person;
import university.oop.livingBeing.humans.humanAttribute.FullName;

public class Human {
    private FullName fullName;
    private int height;

    private final Human father;

    public Human(FullName fullName, int height) throws Exception {
        this(fullName, height, null);
    }
    public Human(FullName fullName, int height, Human father) throws Exception {
        setFullName(fullName);
        this.father = father;
        if (this.fullName.getSurname() == null) this.fullName.setSurname(this.father.fullName.getSurname());
        if (this.fullName.getPatronymic() == null) this.fullName.setPatronymic(this.father.fullName.getName() + "ович");
        setHeight(height);
    }

    public Human(String name, int height) throws Exception {
        this(new FullName(null, name, null), height, null);
    }

    public Human(String name, int height, Human father) throws Exception {
        this(new FullName(null, name ,null), height, father);
    }


    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) throws Exception {
        if (height > 0 && height < 500) this.height = height;
        else throw new Exception("growth cannot be negative or more than 500");
    }

    public Human getFather() {
        return father;
    }


    public String toString() {
        return fullName + ", рост = " + height;
    }
}
