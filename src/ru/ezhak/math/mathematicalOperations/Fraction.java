package ru.ezhak.math.mathematicalOperations;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class Fraction extends Number implements Cloneable{
    private int numerator; //то что сверху (числитель)
    private int denominator; //то что снизу (знаменатель)

    private static final Map<String, Fraction> fractionCache = new HashMap<>();

    private Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Fraction createFraction (int numerator, int denominator) {
        int num = numerator;
        int denom;
        if (denominator == 0) denom = 1;
        else denom = denominator;
        if (denom < 0) {
            denom = -denom;
            num = -num;
        }

        String key = num + "/" + denom;
        if (!fractionCache.containsKey(key)) {
            fractionCache.put(key, new Fraction(numerator, denominator));
        }
        return fractionCache.get(key);
    }

    public Fraction add (int num) {
        return new Fraction(this.numerator + num * this.denominator, this.denominator);
    }

    public Fraction subtraction (int num) {
        return new Fraction(this.numerator - num * this.denominator, this.denominator);
    }

    public Fraction multiplication (int num) {
        return new Fraction(num * this.numerator, this.denominator);
    }

    public Fraction division (int num) {
        return new Fraction(this.numerator, this.denominator * num);
    }

    public Fraction add (Fraction num) {
        int newNumerator = this.numerator * num.denominator + num.numerator * this.denominator;
        int newDenominator = this.denominator * num.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtraction (Fraction num) {
        int newNumerator = this.numerator * num.denominator - num.numerator * this.denominator;
        int newDenominator = this.denominator * num.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiplication (Fraction num) {
        int newNumerator = this.numerator * num.numerator;
        int newDenominator = this.denominator * num.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction division (Fraction num) {
        int newNumerator = this.numerator * num.denominator;
        int newDenominator = this.denominator * num.numerator;
        return new Fraction(newNumerator, newDenominator);
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
    public Fraction clone(){
        try{
            return (Fraction)super.clone();
        }
        catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }
}
