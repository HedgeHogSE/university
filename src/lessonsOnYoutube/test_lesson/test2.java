package lessonsOnYoutube.test_lesson;

public class test2 {
    public static void main(String[] args) {
        int[] mas = {3, 2, 10, 5, 8};
        /*for (int number : mas) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }*/
        for (int i = 0; i < 5; i += 2) {
            System.out.println(mas[i]);
        }
    }
}