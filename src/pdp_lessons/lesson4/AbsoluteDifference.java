package pdp_lessons.lesson4;

import java.util.Scanner;

public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int difference;

        if (number1 > number2) {
            difference = number1 - number2;
        } else {
            difference = number2 - number1;
        }
        System.out.println(difference);
    }
}
