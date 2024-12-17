package ru.ezhak.dataStream;

import java.util.List;

public interface Operation<T> {
    List<T> apply(List<T> input);
}