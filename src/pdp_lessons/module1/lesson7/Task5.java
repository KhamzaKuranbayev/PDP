package pdp_lessons.module1.lesson7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= 14; i++)
            System.out.print(number * i + " ");
    }
}
