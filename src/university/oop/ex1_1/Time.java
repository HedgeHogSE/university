package university.oop.ex1_1;

public class Time {
    //private int fullSecond;
    private int hour;
    private int minute;
    private int second;


    public Time (int second) {
        this.second = second % 60;
        this.minute = (second / 60) % 60;
        this.hour = (second / 60 / 60) % 60;
        if (this.hour >= 24) this.hour -= 24 * (hour / 24);
    }

    public Time (int hour, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
        if (this.hour >= 24) this.hour -= 24 * (hour / 24);
    }

    public String toString () {
        String second = (this.second + "").length() == 2 ? this.second + "" : "0" + this.second;

        String minute = (this.minute + "").length() == 2 ? this.minute + "" : "0" + this.minute;

        String hour = (this.hour + "").length() == 2 ? this.hour + "" : "0" + this.hour;

        return String.format("%s:%s:%s", hour, minute, second);
    }

    public int getSecond() {
        return second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
