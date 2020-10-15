package pdp_lessons.module1.lesson5;

import java.util.Scanner;

public class SignNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        boolean b = scanner.nextBoolean();

        System.out.println(in1To10(num1, b));
    }

    static String getSignOfNumber(int number) {
        if (number > 0) {
            return "musbat";
        } else if (number == 0) {
            return "no musbat son";
        }
        return "manfiy";
    }

    static String calculateFunc(int k, int x, int b) {

        if (x > 0 && x < 40) {
            return "f (" + x + ") = " + k * x * x + b;
        } else {
            return "x ni 0<x<40 oralig'ida kiriting";
        }
    }

    static int getCentury(int year) {
        int a = year / 100;
        int b = year % 100;

        if (b > 0)
            return a + 1;
        return a;
    }

    static String calculateFunc(double x, double y) {

        boolean b1 = x >= 0 && x <= 5;
        boolean b2 = y >= 0 && y <= 10;

        if (b1 && b2)
            return "f(" + x + ", " + y + ") = " + (1 / (Math.pow(x - y, 2) + 1));
        return "Iltimos, x va y ni 0 ≤x≤ 5, 0≤y≤10 oraliqda kiriting!";
    }

    static double getHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    static int countDigits(int number) {
        // 0 .. 1000 000 000
        int count = 1;

        if (number >= 100000000) {
            count += 8;
            number /= 100000000;
        }
        if (number >= 10000) {
            count += 4;
            number /= 10000;
        }
        if (number >= 100) {
            count += 2;
            number /= 100;
        }
        if (number >= 10) {
            count += 1;
        }
        return count;
    }

    static boolean in1To10(int n, boolean outsideMode) {
        boolean b = n >= 0 && n <= 10;

        return b || outsideMode;
    }

    static int findBinary(int decimal) {

        System.out.println("p");

        if (decimal == 0) {
            return 0;
        } else {
            return (decimal % 2 + 10 * findBinary(decimal / 2));
        }

    }

}
