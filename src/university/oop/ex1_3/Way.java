package university.oop.ex1_3;

public class Way {
    public City city;
    public  int price;

    public Way(City city, int price) {
        this.city = city;
        this.price = price;
    }

    public String toString() {
        return city.name + ": " + price;
    }
}