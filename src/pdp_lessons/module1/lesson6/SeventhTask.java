package pdp_lessons.module1.lesson6;

import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int index = scanner.nextInt();
        System.out.println(getChars(a, index));
    }

    public static String getChars(String str, int index) {
        if(index >= 0) {
            if(str.substring(index).length() >= 2) {
                return str.substring(index, index + 2);
            }
        }
        return str.substring(0, 2);
    }
}
