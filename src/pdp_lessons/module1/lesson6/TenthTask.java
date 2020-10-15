package pdp_lessons.module1.lesson6;

import java.util.Scanner;

public class TenthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(removeChars(a));
    }

    public static String removeChars(String str) {
        boolean a = str.charAt(0) == 'a';
        boolean b = str.charAt(1) == 'b';
        if (a && b) {
            return str;
        } else if (a) {
            return "a".concat(str.substring(2));
        } else if (b) {
            return str.substring(1);
        }
        return str.substring(2);
    }

}
