package ru.ezhak.city;

public class Way {
    private City city;
    public int price;

    public Way(City city, int price) {
        this.city = city;
        this.price = price;
    }

    public City getCity() {
        return city;
    }

    public String toString() {
        return city.getName() + ": " + price;
    }
}