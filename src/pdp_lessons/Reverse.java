package pdp_lessons;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String fifth = number % 10 + "";
        number = number / 10;

        String fourth = number % 10 + "";
        number = number / 10;

        String third = number % 10 + "";
        number = number / 10;

        String second = number % 10 + "";
        number = number / 10;

        String first = number % 10 + "";

        System.out.println(fifth + fourth + third + second + first);
    }
}
