package ru.ezhak.box;

public class Box<T> {
    private T ob;

    public boolean isEmpty() {
        return ob == null;
    }

    public T getObject() {
        T copyOb = ob;
        ob = null;
        return copyOb;
    }

    public void setObject(T ob) {
        if (!this.isEmpty()) throw new RuntimeException();
        this.ob = ob;
    }
}
