package university.oop.city;

public class Way {
    public City city;
    public  int price;

    public Way(City city, int price) {
        this.city = city;
        this.price = price;
    }

    public String toString() {
        return city.getName() + ": " + price;
    }
}