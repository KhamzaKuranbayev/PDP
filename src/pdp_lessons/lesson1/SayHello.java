package pdp_lessons.lesson1;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();
        System.out.println("Hello " + firstname + " " + lastname + "!");
    }
}
