package ru.ezhak.methods;

public interface Apply<T, P> {
    P apply(T input);
}