package ru.ezhak.dataStream;

public interface Reduce<T> {

    public T reduce(T init, T current);

}
