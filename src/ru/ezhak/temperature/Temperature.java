package ru.ezhak.temperature;

public class Temperature {
    private String name;
    private int minTemp;
    private int maxTemp;

    private static final Temperature COLD = new Temperature("Cold", -50, 10);
    private static final Temperature NORMAL = new Temperature("Normal", 10, 25);
    private static final Temperature HOT = new Temperature("Hot", 25, 60);


    private Temperature(String name, int minTemp, int maxTemp) {
        this.name = name;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    public static Temperature createCold () {
        return COLD;
    }
    public static Temperature createNormal () {
        return NORMAL;
    }
    public static Temperature createHot () {
        return HOT;
    }

    public String getName() {
        return name;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }
}
