package ru.ezhak.city;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Way way = (Way) o;
        return price == way.price && Objects.equals(city, way.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, price);
    }

    public String toString() {
        return city.getName() + ": " + price;
    }
}