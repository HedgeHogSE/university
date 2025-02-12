package ru.ezhak.stock;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private final String name;
    private int price;

    private List<StockObserver> observers = new ArrayList<>();

    public Stock(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifyObservers();
    }

    public void addObserver (StockObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(this);
        }
    }
}
