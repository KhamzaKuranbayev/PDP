package pdp_lessons.module1.lesson4;

import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if ((number % 3 == 0) && (number % 5 == 0) || number < 0) {
            number *= number;
        } else {
            number = number * number * number;
        }
        System.out.println(number);
    }
}
