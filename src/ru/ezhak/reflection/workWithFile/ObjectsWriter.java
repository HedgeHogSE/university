package ru.ezhak.reflection.workWithFile;

import ru.ezhak.reflection.reflectionUtils.ReflectionUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

public class ObjectsWriter {
    public String name;

    public ObjectsWriter(String name) {
        this.name = name;
    }

    public void write (List<?> list) throws IOException, IllegalAccessException {
        File file = new File(name);
        file.createNewFile();

        try (FileWriter writer = new FileWriter(file, true)) {
            for (Object obj : list) {
                Class<?> clazz = obj.getClass();
                StringBuilder result = new StringBuilder(clazz.getSimpleName()).append("{");

                List<Field> fields = ReflectionUtils.fieldCollection(clazz);
                for (Field field : fields) {
                    field.setAccessible(true);
                    result.append(field.getName()).append("=").append(field.get(obj)).append(",");
                }

                if (!fields.isEmpty()) {
                    result.deleteCharAt(result.length() - 1);
                }
                result.append("}\n");

                writer.write(result.toString());
            }
        }
    }
}
