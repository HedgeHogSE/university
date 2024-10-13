package lessonsOnYoutube.new_oop.oopBaza;

public class Rabotnik {
    String name;
    String jobTitle;
    int salary;

    Rabotnik(String name, String jobTitle, int salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    String getInfo(int month) {
        return "Имя: " + name + ". Должность: " + jobTitle + ". За последние " + month + " месяцев получил " + month * salary + " рублей.";
    }

}
