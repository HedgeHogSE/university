package ru.ezhak.city;

import java.util.List;

public class CityTwoWay extends City{

    public CityTwoWay(String name) {
        super(name);
    }

    public CityTwoWay(String name, List<Way> ways) throws Exception {
        super(name, ways);
    }


    @Override
    public void addWay(Way way) {
        super.addWay(way);
        way.getCity().addWay(new Way(this, way.price));
    }
}
