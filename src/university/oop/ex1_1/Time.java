package university.oop.ex1_1;

public class Time {
    public int fullSecond;

    public Time (int sec) {
        this.fullSecond = sec;
    }

    public String toString () {
        int fullTime = this.fullSecond;
        String second = ((fullTime % 60) + "").length() == 2 ? (fullTime % 60) + "" : "0" + (fullTime % 60);
        fullTime /= 60;

        String minute = ((fullTime % 60) + "").length() == 2 ? (fullTime % 60) + "" : "0" + (fullTime % 60);
        fullTime /= 60;

        fullTime -= 24 * (fullTime / 24);

        String hour = ((fullTime % 60) + "").length() == 2 ? (fullTime % 60) + "" : "0" + (fullTime % 60);

        return String.format("%s:%s:%s", hour, minute, second);
    }

}
