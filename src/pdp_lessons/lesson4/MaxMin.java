package pdp_lessons.lesson4;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();

        // 12 50 23 80 10
        // max = 80
        // min = 10

        int max = number1;
        int min = number2;

        if (number1 < number2) {
            max = number2;
            min = number1;
        }

        if (number3 > max) {
            max = number3;
        } else if (number3 < min) {
            min = number3;
        }

        if (number4 > max) {
            max = number4;
        } else if (number4 < min) {
            min = number4;
        }

        if (number5 > max) {
            max = number5;
        } else if (number5 < min) {
            min = number5;
        }

        System.out.println("max = " +max + ", min = " + min);
    }
}
