package university.oop.livingBeing.humans.person;

public class Main {
    public static void main(String[] args) throws Exception {
        Student student = new Student("Санёк", new int[] {2,4,5});
        System.out.println(student);
        student.addGrades(5,5,5);
        System.out.println(student);

    }
}
