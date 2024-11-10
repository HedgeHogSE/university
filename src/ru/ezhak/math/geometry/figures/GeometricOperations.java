package ru.ezhak.math.geometry.figures;

import java.util.List;

public class GeometricOperations {
    public double sumArea (List<Figure> figures) {
        double result = 0;
        for (Figure figure : figures) {
            result += figure.area();
        }
        return result;
    }
}
