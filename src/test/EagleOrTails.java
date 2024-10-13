package test;

import java.util.Scanner;
import java.util.Random;
public class EagleOrTails {
    public static void main(String[] args) {
        double sumEagle = 0;
        double sumTails = 0;
        double counter = 0;
        int i = 0;
        int eagleLucky = 0;
        int tailsLucky = 0;

        while (true) {
            /*Scanner input = new Scanner(System.in);
            System.out.println("О или Р или С?");
            int num = input.nextInt();*/
            Random random = new Random();
            Random random2 = new Random();
            Random random3 = new Random();
            Random random4 = new Random();

            int num = random.nextInt() + random2.nextInt() + random3.nextInt() + random4.nextInt();
            if (num % 2 == 0) {
                sumEagle++;
                eagleLucky++;
                tailsLucky = 0;
            } else {
                sumTails++;
                tailsLucky++;
                eagleLucky = 0;
            }
            counter++;
            System.out.printf("Вероятность выпадения орла %f: \n", sumEagle / counter);
            System.out.printf("Вероятность выпадения решки %f: \n", sumTails / counter);
            System.out.printf("\n");
            i++;
            if (eagleLucky == 10 || tailsLucky == 10) {
                System.out.println(i);
                System.out.println("Lucky");
                break;
            }
            //if (i == 100000) break;
        }
    }
}
