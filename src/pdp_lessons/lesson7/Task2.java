package pdp_lessons.lesson7;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int p = scanner.nextInt();

        for (int i = x; i <= y; i++) {
            if (i % p == 0)
                System.out.print(i + " ");
        }
    }
}
