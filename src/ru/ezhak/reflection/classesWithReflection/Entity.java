package ru.ezhak.reflection.classesWithReflection;

import ru.ezhak.reflection.reflectionUtils.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;

public abstract class Entity {
    @Override
    public String toString() {
        String result = this.getClass().getSimpleName() + "{";

        Class<?> clazz = this.getClass();
        List<Field> fields = ReflectionUtils.fieldCollection(clazz);
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                result += field.getName() + "=" + field.get(this) + ",";
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        return result.substring(0, result.length() - 1) + "}";
    }
}
