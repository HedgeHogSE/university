package ru.ezhak.methods;

import java.util.List;

public interface Reduce<T> {

    public T reduce(T init, T current);

}
