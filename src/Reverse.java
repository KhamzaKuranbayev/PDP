import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(reverse(scanner.nextLine()));
    }

    public static String reverse(String text) {
        if (text.length() == 0) {
            return "";
        }
        return reverse(text.substring(1) + "") + text.charAt(0);

        // hellojava
        // ellojavah
        // llojavaeh
        // leh
    }
}
