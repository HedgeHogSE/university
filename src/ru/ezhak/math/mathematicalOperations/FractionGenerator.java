package ru.ezhak.math.mathematicalOperations;

import java.util.HashMap;
import java.util.Map;

public class FractionGenerator {
    private static final FractionGenerator fractionGenerator = new FractionGenerator();


    private FractionGenerator() {
    }

    public static FractionGenerator getInstance () {
        return fractionGenerator;
    }

    public Fraction createFraction (int numerator, int denominator) {
        return Fraction.createFraction(numerator, denominator);
    }

}
