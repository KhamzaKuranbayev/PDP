package pdp_lessons.module1.lesson7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int sum = 0;
        if (num >= 0) {
            for (int i = 0; i <= num; i++) {
                sum += i;
            }
        } else {
            for (int i = num; i < 0; i++) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
