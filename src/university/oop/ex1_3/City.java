package university.oop.ex1_3;

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
