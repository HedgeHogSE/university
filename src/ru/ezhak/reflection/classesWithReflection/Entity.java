package ru.ezhak.reflection.classesWithReflection;

import ru.ezhak.reflection.reflectionUtils.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public abstract class Entity {
    @Override
    public String toString() {
        String result = this.getClass().getSimpleName() + "{";

        Class<?> clazz = this.getClass();
        List<Method> methods = ReflectionUtils.methodCollection(clazz);
        for (Method method : methods) {
            if (method.getName().startsWith("get")) {
                String fieldName = method.getName().substring(3);
                fieldName = Character.toLowerCase(fieldName.charAt(0)) + fieldName.substring(1);
                try {
                    result += fieldName + "=" + method.invoke(this) + ",";
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return result.substring(0, result.length() - 1) + "}";
    }
}
