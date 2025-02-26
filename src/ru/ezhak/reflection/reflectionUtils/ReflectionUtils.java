package ru.ezhak.reflection.reflectionUtils;

import ru.ezhak.math.geometry.lines.Line;
import ru.ezhak.math.geometry.points.Point2D;
import ru.ezhak.reflection.classesWithReflection.A;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public static List<Method> methodCollection (Class<?> clazz) {
        List<Method> result = new ArrayList<>(List.of(clazz.getDeclaredMethods()));
        clazz = clazz.getSuperclass();
        while (clazz != null && clazz != Object.class) {
            result.addAll(List.of(clazz.getDeclaredMethods()));
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
            method.invoke(clazz.getConstructor().newInstance());
        }
    }

    public static <T> T cache(T object) {
        Class<?> clazz = object.getClass();
        if (!clazz.isInterface() && clazz.getInterfaces().length == 0) {
            return object;
        }

        return (T) Proxy.newProxyInstance(
                clazz.getClassLoader(),
                clazz.getInterfaces(),
                new CacheHandler(object)
        );
    }

    public static class CacheHandler implements InvocationHandler {
        private final Object original;
        private final Map<Method, Object> cache = new HashMap<>();
        private int lastHash;

        public CacheHandler(Object original) {
            this.original = original;
            this.lastHash = original.hashCode();
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (original.hashCode() != lastHash) {
                cache.clear();
                lastHash = original.hashCode();
            }

            if (args == null || args.length == 0) {
                if (cache.containsKey(method)) {
                    return cache.get(method);
                }

                Object result = method.invoke(original);
                cache.put(method, result);
                return result;
            }

            return method.invoke(original, args);
        }
    }
}
