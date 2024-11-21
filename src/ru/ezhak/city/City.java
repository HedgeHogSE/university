package ru.ezhak.city;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City {
    protected String name;
    protected List<Way> ways = new ArrayList<>();

    public City(String name) {
        setName(name);
        ways = new ArrayList<>();
    }


    public City(String name, List<Way> ways) {
        this(name);
        setWays(ways);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Way> getWays() {
        return new ArrayList<>(ways);
    }

    public void setWays(List<Way> ways) {
        for (Way way : ways) {
            addWay(way);
        }
    }

    public void addWay(Way way) {
        if (way.getCity() == this) return;
        //List<Way> waysCity = way.getCity().ways;
        for (Way thisWay : ways) {
            if (thisWay.getCity() == way.getCity()) {
                thisWay.price = way.price;
                return;
            }
        }
        this.ways.add(way);
    }

    public void removeWay(Way way) {
        this.ways.remove(way);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || (o.getClass() != CityTwoWay.class && getClass() != o.getClass())) return false;
        if (o instanceof CityTwoWay) {
            CityTwoWay cityTwoWay = (CityTwoWay) o;
            if (cityTwoWay.getWays().size() != this.ways.size()) return false;
            for (Way way : cityTwoWay.ways) {
                if(!this.ways.contains(way)) return false;
            }
        }
        else {
            City city = (City) o;
            if (city.getWays().size() != this.ways.size()) return false;
            for (Way way : city.ways) {
                if(!this.ways.contains(way)) return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int res = 0;
        for (Way way : ways) {
            res += way.hashCode();
        }
        return res;
    }

    @Override
    public String toString() {
        return "Город " + this.name + " с путями: " + ways.toString();
    }
}