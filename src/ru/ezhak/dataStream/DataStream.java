/*package ru.ezhak.dataStream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class DataStream <T> {
    private final List<T> list;

    private final List<Operation<T>> operations = new ArrayList<>();

    private DataStream(List<T> list) {
        this.list = list;
    }



    public static <T> DataStream<T> of (List<T> list) {
        return new DataStream<>(list);

    }

    /*public <R> DataStream<R> map(Apply<T, R> apply) {
        List<R> newList = new ArrayList<>();
        for (T t : list) {
            newList.add(apply.apply(t));
        }
        return new DataStream<>(newList);
    }
    public DataStream<T> filter (Test<T> test) {
        List<T> newList = new ArrayList<>();
        for (T t : list) {
            if (test.test(t)) {
                newList.add(t);
            }
        }
        return new DataStream<>(newList);
    }

    public <P> DataStream<T> map(Apply<T, P> apply) {
        operations.add(list -> {
            List<T> result = new ArrayList<>();
            for (T item : list) {
                result.add((T) apply.apply(item));
            }
            return result;
        });
        return this;
    }
    public DataStream<T> filter (Test<T> test) {
        operations.add(list -> {
            List<T> result = new ArrayList<>();
            for (T item : list) {
                if (test.test(item)) {
                    result.add(item);
                }
            }
            return result;
        });
        return this;
    }

    public T reduce (Reduce<T> reduce, T initial) {
        if (list.isEmpty()) return initial;
        int currentIndex = 0;
        if (initial == null) {
            initial = list.getFirst();
            currentIndex++;
        }
        execute();
        for (int i = currentIndex; i < list.size(); i++) {
            initial = reduce.reduce(initial, list.get(i));
        }
        return initial;
    }

    public <P> P collect(Supplier<P> collectionFactory, BiConsumer<P, T> elementAdder) {
        P resultCollection = collectionFactory.get();
        for (T element : list) {
            elementAdder.accept(resultCollection, element);
        }
        return resultCollection;
    }

    public List<T> execute() {
        List<T> result = new ArrayList<>(list);
        for (Operation<T> operation : operations) {
            result = operation.apply(result);
        }
        return result;
    }

    public List<T> asList () {
        return new ArrayList<>(list);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}*/

