package test_oop;

public class Garage {
    private Car car1;
    private Car car2;

    public Garage(){

    }
    public void setCar1(Car car1){
        this.car1 = car1;
    }

    public void setCar2(Car car2) {
        this.car2 = car2;
    }

    public void getInfoAboutCar(){
        System.out.println(car1.getBrand());
        car1.acceleration100();
        System.out.println(car2.getBrand());
        car2.acceleration100();
    }
}
