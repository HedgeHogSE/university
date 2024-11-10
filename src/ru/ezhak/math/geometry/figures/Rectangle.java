package ru.ezhak.math.geometry.figures;

import ru.ezhak.math.geometry.points.Point;

public class Rectangle extends Figure {
    private int side1;
    private int side2;
    public Rectangle(Point point, int side1, int side2) throws Exception {
        super(point);
        setSide1(side1);
        setSide2(side2);

    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) throws Exception {
        if (side1 < 0) throw new Exception("the length of the side must be greater than zero");
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) throws Exception {
        if (side2 < 0) throw new Exception("the length of the side must be greater than zero");
        this.side2 = side2;
    }

    @Override
    public double area() {
        return this.side1 * this.side2;
    }

}
