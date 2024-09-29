package test_oop;

public class Car {
    private String brand;
    private int maxSpeed = 220;

    public Car(String brand){
        this.brand = brand;
    }
    public Car(String brand, int maxSpeed){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void acceleration100(){
        System.out.printf("Скорость разгона до 100 км/ч : %d\n", 110 / (maxSpeed / 20));
    }

    public String getBrand() {
        return brand;
    }
}
