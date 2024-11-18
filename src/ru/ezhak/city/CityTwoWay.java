package ru.ezhak.city;

import java.util.List;

public class CityTwoWay extends City{

    public CityTwoWay(String name) {
        super(name);
    }

    public CityTwoWay(String name, List<Way> ways) {
        super(name, ways);
    }


    @Override
    public void addWay(Way way) {
        super.addWay(way);
        for (int i=0; i < way.getCity().getWays().size(); i++) {
            if (way.getCity().getWays().get(i).getCity() == this) return;
        }
        way.getCity().addWay(new Way(this, way.price));
    }
}
