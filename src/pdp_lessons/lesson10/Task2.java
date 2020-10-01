package pdp_lessons.lesson10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getDouble(scanner.nextDouble()));
    }

    public static String getDouble(double num) {
        return String.valueOf(num);
    }
}
