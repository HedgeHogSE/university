package ru.ezhak.reflection.reflectionUtils;

import ru.ezhak.math.geometry.lines.Line;
import ru.ezhak.math.geometry.points.Point2D;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectionUtils {
    public static List<Field> fieldCollection (Class<?> clazz) {
        List<Field> result = new ArrayList<>(List.of(clazz.getDeclaredFields()));
        clazz = clazz.getSuperclass();
        while (clazz != null) {
            result.addAll(List.of(clazz.getDeclaredFields()));
            clazz = clazz.getSuperclass();
        }
        return result;
    }

    public static void lineConnector (Line<? extends Point2D> line1, Line<? extends Point2D> line2) throws NoSuchFieldException, IllegalAccessException {
        if (line1 == null || line2 == null) {
            throw new IllegalArgumentException("Обе линии должны быть инициализированы!");
        }
        Class<?> lineClass = Line.class;

        Field fieldLine1 = lineClass.getDeclaredField("point2");
        Field fieldLine2 = lineClass.getDeclaredField("point1");

        fieldLine1.setAccessible(true);
        fieldLine2.setAccessible(true);

        if (!fieldLine1.get(line1).getClass().equals(fieldLine2.get(line2).getClass())) {
            throw new IllegalArgumentException("Несовместимые типы точек!");
        }

        fieldLine2.set(line2, fieldLine1.get(line1));
    }

    public static void validate (Object o, Class<?> clazz) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            method.invoke(clazz.getConstructor().newInstance(), o);
        }
    }


}
