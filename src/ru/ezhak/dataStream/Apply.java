package ru.ezhak.dataStream;

public interface Apply<T, P> {
    P apply(T input);
}