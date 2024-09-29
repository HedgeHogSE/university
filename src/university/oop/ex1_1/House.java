package university.oop.ex1_1;

public class House {
    private int numberOfFloors = 0;

    public House (int num) {
        this.numberOfFloors = num;
    }

    public String aboutHouse () {
        if (this.numberOfFloors == 0) return "Дом с 0 этажей";
        else if (this.numberOfFloors % 100 == 11) return String.format("Дом с %d этажами", this.numberOfFloors);
        else if (this.numberOfFloors % 10 == 1) return String.format("Дом с %d этажом", this.numberOfFloors);
        else return String.format("Дом с %d этажами", this.numberOfFloors);
    }
}
