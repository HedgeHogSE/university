package ru.ezhak.time;

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
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public String toString () {
        String second = (this.second + "").length() == 2 ? this.second + "" : "0" + this.second;

        String minute = (this.minute + "").length() == 2 ? this.minute + "" : "0" + this.minute;

        String hour = (this.hour + "").length() == 2 ? this.hour + "" : "0" + this.hour;

        return String.format("%s:%s:%s", hour, minute, second);
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            if (hour < 0 && hour > -24) this.hour = 24 - Math.abs(hour);
            else this.hour = 24 - (Math.abs(hour) - 24 * (Math.abs(hour) / 24));
        }
        else this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            if (minute < 0 && minute > -60) this.minute = 60 - Math.abs(minute);
            else this.minute = 60 - (Math.abs(minute) - 60 * (Math.abs(minute) / 60));
        }
        else this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            if (second < 0 && second > -60) this.second = 60 - Math.abs(second);
            else this.second = 60 - (Math.abs(second) - 60 * (Math.abs(second) / 60));
        }
        else this.second = second;
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
