package ru.ezhak.math.geometry.points.difPoint;

public abstract class Attribute {
    protected String name;
    protected Object value;

    public Attribute(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + ":" + value;
    }
}
