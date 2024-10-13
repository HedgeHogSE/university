package university.oop.city;

import university.oop.city.Way;

import java.util.Arrays;

public class City {
    public String name;
    public Way[] ways;


    public City(String name) {
        this.name = name;
    }

    public City(String name, Way[] ways) {
        this.name = name;
        this.ways = ways;
    }


    public String toString() {
        return "Город " + this.name + "с путями: " + Arrays.toString(ways);
    }
}
