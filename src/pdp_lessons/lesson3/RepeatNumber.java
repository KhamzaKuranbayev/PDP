package pdp_lessons.lesson3;

import java.util.Scanner;

public class RepeatNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean notFount = true;
        String repeatNUmber = " ";

        String fourth = number % 10 + "";
        number = number / 10;

        String third = number % 10 + "";
        number = number / 10;

        String second = number % 10 + "";
        number = number / 10;

        String first = number % 10 + "";

        boolean b1 = first.equals(second) || first.equals(third) || first.equals(fourth);
        boolean b11 = first.equals(second) && first.equals(third) && first.equals(fourth);
        boolean b2 = second.equals(third) || second.equals(fourth);
        boolean b3 = third.equals(fourth);

        if (b1 || b11) {
            repeatNUmber += first + " ";
            notFount = false;
        }
        if (b2 && !b11) {
            repeatNUmber += second + " ";
            notFount = false;
        }
        if (b3 && !b11) {
            repeatNUmber += third + " ";
            notFount = false;
        }

        if (notFount) {
            System.out.println("Takrorlanuvchi raqam yo'q.");
        } else {
            System.out.println("Takrorlanuvchi raqam:" + repeatNUmber);
        }
    }
}
