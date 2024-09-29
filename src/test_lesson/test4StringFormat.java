package test_lesson;

public class test4StringFormat {
    public static void main(String[] args) {
        String carMark = "Audi";
        String carModel = "Q3";
        double price = 15_000.00;
        boolean Trans = true;
        System.out.printf("Привет, я менеджер салона %s. У нас есть модель - %s за %f. Есть ли у нее автоматическая коробка передач?", carMark, carModel, price);
        if (Trans){
            System.out.println(" Да");
        }
        else System.out.println(" Нет");
    }
}
