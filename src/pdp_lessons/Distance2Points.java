package pdp_lessons;

import java.util.Scanner;

public class Distance2Points {

    static int counter = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //        System.out.print("latitude : ");
//        double x1 = scanner.nextDouble();
//        System.out.print("longitude : ");
//        double y1 = scanner.nextDouble();
//
//        System.out.print("latitude : ");
//        double x2 = scanner.nextDouble();
//        System.out.print("longitude : ");
//        double y2 = scanner.nextDouble();

        int n = scanner.nextInt();

        System.out.println(decToBin(n));
    }

    public static String missingChar(String str, int n) {
        return str.replace(str.charAt(n) + "", "");
    }

    static double distancePoints(double x1, double y1, double x2, double y2) {
        return 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    }

    static int sum(int n, int m) { // 5 .. 10
        if (n <= m) {
            return n + sum(n + 1, m);
        }
        return 0;
    }

    static int factorial(int n) { // 10! = 1 * 2 *.. * 10
        if (n > 1) {
            return n * factorial(n - 1);
        }
        return 1;
    }

    // 1- yo'l
    static int fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        if (n > 0)
            return fibonacci(n - 1) + fibonacci(n - 2);

        return 0;
    }

    // 2 - yo'l
    static int num0 = 0, num1 = 1;

    static void fibonacci2(int number) {
        if (number > 0) {
            System.out.print(num0 + " ");

            int num2 = num0 + num1;
            num0 = num1;
            num1 = num2;
            fibonacci2(number - 1);
        }
    }

    static String decToBin(int number) {
        boolean b1 = number / 2 == 1 && number % 2 == 0;
        boolean b2 = number / 2 == 1 && number % 2 == 1;

        if (b1) {
            return "10";
        } else if (b2) {
            return "11";
        }
        return decToBin(number / 2) + "" + number % 2;
    }

}
