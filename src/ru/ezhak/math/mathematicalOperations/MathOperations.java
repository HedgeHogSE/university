package ru.ezhak.math.mathematicalOperations;

import java.math.*;

import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public class MathOperations {
    public static double sum(Number... numbers) {
        double total = 0.0;
        for (Number number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }

    public static double expString (String num1, String num2) {
        double n1 = parseInt(num1);
        double n2 = parseInt(num2);
        return pow(n1, n2);
    }
}
