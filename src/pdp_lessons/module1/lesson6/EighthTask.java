package pdp_lessons.module1.lesson6;

import java.util.Scanner;

public class EighthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        System.out.println(getNewString(a, b));
    }

    public static String getNewString(String a, String b) {
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a.concat(b.substring(1));
        }
        return a.concat(b);
    }
}
