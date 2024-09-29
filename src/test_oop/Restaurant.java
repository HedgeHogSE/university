package test_oop;

public class Restaurant {
    private static int sausage = 0;
    private static int bread = 0;
    public void cookHotDog(){
        if (sausage > 0 && bread > 1){
            sausage--;
            bread -= 2;
            System.out.println("Хот дог готов!");
        }
        else{
            System.out.println("Нет ничего, иди отсюда");
        }
    }
    public void replenishmentIng(){
        sausage += 100;
        bread += 200;
    }

}
