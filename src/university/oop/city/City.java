package university.oop.city;

import university.oop.city.Way;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City {
    private String name;
    private List<Way> ways = new ArrayList<>();

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
        return ways;
    }

    public void setWays(List<Way> ways) throws Exception {
        for (Way way : ways) {
            addWay(way);
        }
    }

    public void addWay(Way way) throws Exception {
        //this.ways.add(way);
        if (way.city == this) {
            throw new Exception("can't add road to the same city");
        }
        List<Way> waysCity = way.city.ways;
        for (Way value : waysCity) {
            if (value.city == this) throw new Exception("there is already a road between these cities");
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