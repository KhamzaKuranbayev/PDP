package pdp_lessons.module1.extraTask.hackpassword;

import java.util.Random;
import java.util.Scanner;

public class FindPassword2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String random_password = getRandomPassword();
            System.out.println(random_password);
            System.out.print("Please enter your password (exit - stop process): ");
            String user_password = scanner.nextLine();
            user_password = user_password.toUpperCase();

            if (user_password.equals("EXIT"))
                System.exit(0);

            if (user_password.length() != 4 && isNumberLetter(user_password)) {
                System.out.println("Error!!! Password must 4 digits length\n");
            } else if (user_password.length() == 4 && !isNumberLetter(user_password)) {
                System.out.println("Error!!! Password must be numeric and letter\n");
            } else if (user_password.equals(random_password)) {
                System.out.println("Welcome to system!!!\n");
            } else {
                System.out.println("Error!!! Your password does not match. Password is " + random_password + "\n");
            }
        }
    }

    public static boolean isNumberLetter(String str) {
        int countDigit = 0;
        int countLetter = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c))
                countDigit++;
            if (Character.isLetter(c))
                countLetter++;

        }
        return countDigit != 0 && countLetter != 0;
    }

    public static String getRandomPassword() {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            stringBuilder.append(str.charAt(random.nextInt(str.length())));
        }
        return stringBuilder.toString();
    }


}
