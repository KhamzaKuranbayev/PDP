package pdp_lessons.lesson6;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(getNewString(a, b));
    }

    public static String getNewString(String a, String b) {
        if (a.length() >= 1 && b.length() >= 1) {
            return a.substring(1).concat(b.substring(1));
        }
        return "Matnlar uzunligi kamida 1 ga teng bo'lishi kerak";
    }
}
