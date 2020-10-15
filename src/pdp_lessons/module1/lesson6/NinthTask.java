package pdp_lessons.module1.lesson6;

import java.util.Scanner;

public class NinthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(changeLastChars(a));
    }

    public static String changeLastChars(String str) {
        char newChar = str.charAt(str.length() - 1);
        char oldChar = str.charAt(str.length() - 2);
        return str.replace(oldChar, newChar).substring(0, str.length() - 1).concat(oldChar + "");
    }
}
