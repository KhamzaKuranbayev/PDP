package jetbrains_academy.others;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int name = scanner.nextInt();
        boolean bool = scanner.nextBoolean();

        System.out.println(theEnd(name, bool));
    }

    public static String theEnd(int str, boolean front) {
        if (front)
            return String.valueOf(str).substring(0, 1);

        else
            return (str+"").substring((str+"").length() - 1);
    }
}

