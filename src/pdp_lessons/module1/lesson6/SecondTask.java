package pdp_lessons.module1.lesson6;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(getNewString(a));
    }

    public static String getNewString(String str) {
        if (str.length() >= 2) {
            str = str.substring(str.length() - 2);
            return str.concat(str.concat(str));
        }
        return "Matn uzunligi kamida 2 ga teng bo'lishi kerak";
    }

}
