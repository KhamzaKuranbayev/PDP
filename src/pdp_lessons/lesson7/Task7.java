package pdp_lessons.lesson7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        while (count < 10) {
            System.out.print((int) Math.pow(number, count) + " ");
            count++;
        }
    }
}
