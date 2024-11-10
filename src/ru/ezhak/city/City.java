package ru.ezhak.city;

import java.util.ArrayList;
import java.util.List;

public class City {
    protected String name;
    protected List<Way> ways = new ArrayList<>();

    public City(String name) {
        setName(name);
        ways = new ArrayList<>();
    }


    public City(String name, List<Way> ways) throws Exception {
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
    public String toString() {
        return "Город " + this.name + " с путями: " + ways.toString();
    }
}