package pdp_lessons.module1.lesson7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " tub");
        } else {
            System.out.println(number + " tub emas");
        }
    }

    public static boolean isPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }
        return count == 2;
    }
}
