package ru.ezhak.math.mathematicalOperations;

public class MathOperations {
    public static double sum(Number... numbers) {
        double total = 0.0;
        for (Number number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }
}
