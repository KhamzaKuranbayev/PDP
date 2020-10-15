package pdp_lessons.module1.extraTask;

import java.util.Random;
import java.util.Scanner;

public class ThinkNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int thinkNumber = random.nextInt(10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Men bitta son o’yladim Bu sonni toping");
        int userNumber = scanner.nextInt();

        if (thinkNumber == userNumber) {
            System.out.println("Siz yutdingiz");
        } else {
            System.out.println("Noto'g'ri! Sizda 2ta imkoniyat qoldi. Iltimos yana son kiriting:");
            userNumber = scanner.nextInt();
            if (thinkNumber == userNumber) {
                System.out.println("Siz yutdingiz");
            } else {
                System.out.println("Noto'g'ri! Sizda 1ta imkoniyat qoldi. Iltimos yana son kiriting:");
                userNumber = scanner.nextInt();
                if (thinkNumber == userNumber) {
                    System.out.println("Siz yutdingiz");
                } else {
                    System.out.println("Siz yutqazdingiz");
                }
            }
        }


    }
}
