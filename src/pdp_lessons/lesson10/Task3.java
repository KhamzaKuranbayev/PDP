package pdp_lessons.lesson10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doira radiusini kiriting:");
        double radius = scanner.nextDouble();

        System.out.println("Uzunligi l = " + getLength(radius) + "\nYuzasi S = " + getAria(radius));
    }

    public static double getLength(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double getAria(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
