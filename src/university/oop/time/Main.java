package university.oop.time;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(23,30,30);
        System.out.println(time);
        time.setHour(25);
        time.setMinute(61);
        time.setSecond(61);
        System.out.println(time);
        time.setHour(-1);
        time.setMinute(-1);
        time.setSecond(-1);
        System.out.println(time);
        time.setHour(-25);
        time.setMinute(-61);
        time.setSecond(-61);
        System.out.println(time);
    }
}
