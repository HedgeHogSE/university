package ru.ezhak.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Methods {
    public static  <T, P> List<P> map (List<T> list, Apply<T, P> apply) { //6.3.1
        List<P> newList = new ArrayList<>();
        for (T t : list) {
            newList.add(apply.apply(t));
        }
        return newList;
    }

    public static <T> List<T> filter (List<T> list, Test<T> test) { //6.3.2
        List<T> newList = new ArrayList<>();
        for (T t : list) {
            if (test.test(t)) {
                newList.add(t);
            }
        }
        return newList;
    }

    public static <T> T reduce (List<T> list, Reduce<T> reduce, T initial) { //6.3.3
        if (list.isEmpty()) return initial;
        int currentIndex = 0;
        if (initial == null) {
            initial = list.getFirst();
            currentIndex++;
        }
        for (int i = currentIndex; i < list.size(); i++) {
            initial = reduce.reduce(initial, list.get(i));
        }
        return initial;
    }

    public static <T, P> P processList(List<T> inputList, Supplier<P> collectionFactory, BiConsumer<P, T> elementAdder) { //6.3.4
        P resultCollection = collectionFactory.get();
        for (T element : inputList) {
            elementAdder.accept(resultCollection, element);
        }
        return resultCollection;
    }

}

