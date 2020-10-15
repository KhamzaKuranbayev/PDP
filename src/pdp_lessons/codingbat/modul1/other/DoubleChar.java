package pdp_lessons.codingbat.modul1.other;

import java.util.Scanner;

public class DoubleChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(doubleChar(scanner.nextLine()));
    }

    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i) + "" + str.charAt(i);
        }
        return result;
    }
}
