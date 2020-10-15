package pdp_lessons.module1.lesson6;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(getNewString(a));
    }

    public static String getNewString(String str) {
        str = str.substring(1);
        return str.substring(0, str.length() - 1);
    }
}
