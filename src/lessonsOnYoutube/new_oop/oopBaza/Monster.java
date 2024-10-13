package lessonsOnYoutube.new_oop.oopBaza;

public class Monster {
    private int eye = 2;
    private int leg = 2;
    private int hand = 2;

    Monster(){
    }
    Monster(int eye){
        this.eye = eye;
    }
    Monster(int eye, int hand){
        this.eye = eye;
        this.hand = hand;
    }
    Monster(int eye, int hand, int leg){
        this.leg = leg;
        this.eye = eye;
        this.hand = hand;
    }
    static void voice(){
        System.out.println("Голос");
    }
    static void voice(int i){
        for (int j = 0; j < i; j++) {
            System.out.print("Голос ");
        }
        System.out.print("\n");
    }
    static void voice(int i, String word){
        for (int j = 0; j < i; j++) {
            System.out.printf("%s ", word);
        }
        System.out.print("\n");
    }
}
