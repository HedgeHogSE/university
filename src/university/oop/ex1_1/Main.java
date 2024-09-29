package university.oop.ex1_1;


public class Main {
    public static void main(String[] args) {

        Time time1 = new Time(10);
        System.out.println(time1);
        Time time2 = new Time(10000);
        System.out.println(time2);
        Time time3 = new Time(86400 + 86400 + 10);
        System.out.println(time3);
        System.out.println(time3.fullSecond);
        time3.fullSecond = 3;
        System.out.println(time3);

    }
}
