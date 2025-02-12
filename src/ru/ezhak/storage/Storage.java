package ru.ezhak.storage;

public class Storage<T> {
    private final T ob;

    private static final Storage<?> emptyStorage = new Storage<>(null);

    private Storage(T ob) {
        this.ob = ob;
    }

    public static <T> Storage<T> createStorage (T ob) {
        if (ob == null) throw new RuntimeException();
        else return new Storage<>(ob);
    }

    public static <T>Storage<T> createNullStorage() {
        return (Storage<T>) emptyStorage;
    }

    public boolean isEmpty() {
        return ob == null;
    }

    public T getOb(T type) {
        if (!this.isEmpty()) return ob;

        return type;
    }
}
