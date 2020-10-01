package pdp_lessons.lesson6;

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(getNewString(a));
    }

    public static String getNewString(String str) {
        if (str.length() % 2 == 0 && str.length() >= 2) {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
        }
        return "Matn uzunligi juft va kamida 2 ga teng bo'lishi kerak";
    }
}
