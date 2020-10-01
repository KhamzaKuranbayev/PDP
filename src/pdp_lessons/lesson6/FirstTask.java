package pdp_lessons.lesson6;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(joiningStrings(a, b));
    }

    public static String joiningStrings(String a, String b) {
        return a.concat(b.concat(b.concat(a)));
    }
}
