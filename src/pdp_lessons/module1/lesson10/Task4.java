package pdp_lessons.module1.lesson10;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();

        System.out.print("b = ");
        int b = scanner.nextInt();

        System.out.print("c = ");
        int c = scanner.nextInt();

        double D = getDiscriminant(a, b, c);

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / 2 * a;
            double x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("Kvadrat tenglama 2ta ildizga ega: x1 = " + x1 + " x2 = " + x2);
        } else if (D == 0) {
            double x = (double) -b / (2 * a);
            System.out.println("Kvadrat tenglama 1ta ildizga ega: x = " + x);
        } else {
            System.out.println("Kvadrat tenglama ildizga ega emas!");
        }
    }

    public static double getDiscriminant(int a, int b, int c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

}
