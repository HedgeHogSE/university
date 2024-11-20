package ru.ezhak.math.mathematicalOperations;

import java.util.Objects;

public final class Fraction extends Number implements Cloneable{
    private int numerator; //то что сверху (числитель)
    private int denominator; //то что снизу (знаменатель)

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) this.denominator = 1;
        else this.denominator = denominator;
        if (this.denominator < 0) {
            this.denominator = -this.denominator;
            this.numerator = -this.numerator;
        }
        //this.simplify();
    }

    /*public void simplify() {
        if (this.denominator < 0) {
            this.denominator = -this.denominator;
            this.numerator = -this.numerator;
        }
        int min = Math.min(Math.abs(this.numerator), Math.abs(this.denominator));
        int div = 1;
        for (int i = min; i > 1; i -= 1) {
            if (Math.abs(this.numerator) % i == 0 && Math.abs(this.denominator) % i == 0) div = i;
        }
        this.denominator /= div;
        this.numerator /= div;
    }*/

    public Fraction add (int num) {
        Fraction res = new Fraction(this.numerator + num * this.denominator, this.denominator);
        //res.simplify();
        return res;
    }

    public Fraction subtraction (int num) {
        Fraction res = new Fraction(this.numerator - num * this.denominator, this.denominator);
        //res.simplify();
        return res;
    }

    public Fraction multiplication (int num) {
        Fraction res = new Fraction(num * this.numerator, this.denominator);
        //res.simplify();
        return res;
    }

    public Fraction division (int num) {
        Fraction res = new Fraction(this.numerator, this.denominator * num);
        //res.simplify();
        return res;
    }

    public Fraction add (Fraction num) {
        int newNumerator = this.numerator * num.denominator + num.numerator * this.denominator;
        int newDenominator = this.denominator * num.denominator;
        Fraction res = new Fraction(newNumerator, newDenominator);
        //res.simplify();
        return res;
    }

    public Fraction subtraction (Fraction num) {
        int newNumerator = this.numerator * num.denominator - num.numerator * this.denominator;
        int newDenominator = this.denominator * num.denominator;
        Fraction res = new Fraction(newNumerator, newDenominator);
        //res.simplify();
        return res;
    }

    public Fraction multiplication (Fraction num) {
        int newNumerator = this.numerator * num.numerator;
        int newDenominator = this.denominator * num.denominator;
        Fraction res = new Fraction(newNumerator, newDenominator);
        //res.simplify();
        return res;
    }

    public Fraction division (Fraction num) {
        int newNumerator = this.numerator * num.denominator;
        int newDenominator = this.denominator * num.numerator;
        Fraction res = new Fraction(newNumerator, newDenominator);
        //res.simplify();
        return res;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return (long) numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}
