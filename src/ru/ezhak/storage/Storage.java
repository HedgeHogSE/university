package ru.ezhak.storage;

public class Storage<T> {
    private final T ob;
    private final Class<T> type;

    public Storage(T ob, Class<T> type) {
        this.ob = ob;
        this.type = type;
    }

    public boolean isEmpty() {
        return ob == null;
    }

    public T getOb() {
        if (!this.isEmpty()) return ob;

        if (type == String.class) return (T) "def";
        else if (type == Integer.class) return (T) Integer.valueOf(0);
        else if (type == Double.class) return (T) Double.valueOf(0.0);

        throw new RuntimeException();
    }
}
