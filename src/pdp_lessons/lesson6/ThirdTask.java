package pdp_lessons.lesson6;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(getNewString(a));
    }

    public static String getNewString(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        return str;
    }
}
