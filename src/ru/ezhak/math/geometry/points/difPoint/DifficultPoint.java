package ru.ezhak.math.geometry.points.difPoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DifficultPoint {
    private int x;
    private List<Attribute> attributes = new ArrayList<>();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void addParameterPoint (Attribute parPoint) {
        for (int i = 0; i < attributes.size(); i++) {
            if (Objects.equals(attributes.get(i).name, parPoint.name)) {
                attributes.set(i, parPoint);
                return;
            }
        }
        this.attributes.add(parPoint);
    }

    public List<Attribute> getAttributes() {
        return new ArrayList<>(this.attributes);
    }

    public void setAttributes(List<Attribute> attributes) {
        for (Attribute attribute : attributes) {
            this.addParameterPoint(attribute);
        }
    }



    @Override
    public String toString() {
        return "DifficultPoint{" +
                "x=" + x +
                ", parametersPoints=" + attributes +
                '}';
    }
}
