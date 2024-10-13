package lessonsOnYoutube.new_oop.inheritance;

public class BoxWeight extends Box{
    private double weight;

    public BoxWeight() {
        super();
        this.weight = 0;
    }

    public BoxWeight(double weight){
        super(6.3, 5.4, 6);
        this.weight = weight;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Вес: " + weight);
    }
}
