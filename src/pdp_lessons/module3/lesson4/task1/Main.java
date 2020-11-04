package pdp_lessons.module3.lesson4.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Matn kiriting: ");
        String text = scanner.nextLine();

        try {
            System.out.println(getLength(text));
        } catch (NoTextException ignored) {
            System.out.println(ignored.getMessage());
        }
    }

    public static int getLength(String text) throws NoTextException {
        if ("".equals(text))
            throw new NoTextException();
        return text.length();
    }
}

class NoTextException extends Exception {
    public NoTextException() {
        super("Kiritilgan matn bo’sh bo’lmasligi kerak");
    }
}
