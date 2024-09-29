package test_oop;

public class Test6Car {
    public static void main(String[] args) {

        Car car = new Car("Zvoyakin Car");
        //car.acceleration100();
        Car car1 = new Car("SuperCar", 400);
        //car1.acceleration100();
        Garage garage = new Garage();
        garage.setCar1(car);
        garage.setCar2(car1);
        garage.getInfoAboutCar();
    }
}
