package ru.ezhak.premises;

public class House {
    private int numberOfFloors = 0;

    public House (int num) throws Exception {
        setNumberOfFloors(num);
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) throws Exception {
        if (numberOfFloors < 0) throw new Exception("Number of floors less than zero");
        else this.numberOfFloors = numberOfFloors;
    }

    public String aboutHouse () {
        if (this.numberOfFloors == 0) return "Дом с 0 этажей";
        else if (this.numberOfFloors % 100 == 11) return String.format("Дом с %d этажами", this.numberOfFloors);
        else if (this.numberOfFloors % 10 == 1) return String.format("Дом с %d этажом", this.numberOfFloors);
        else return String.format("Дом с %d этажами", this.numberOfFloors);
    }
}
