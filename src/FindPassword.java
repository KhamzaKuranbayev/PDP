import java.util.Random;
import java.util.Scanner;

public class FindPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String random_password = getRandomPassword();
            System.out.println(random_password);
            System.out.print("Please enter your password (exit - stop process): ");
            String user_password = scanner.nextLine();

            if (user_password.equals("exit"))
                System.exit(0);

            if (user_password.length() != 6 && isNumeric(user_password)) {
                System.out.println("Error!!! Password must 6 digits length\n");
            } else if (!isNumeric(user_password)) {
                System.out.println("Error!!! Password must be numeric\n");
            } else if (user_password.equals(random_password)) {
                System.out.println("Welcome to system!!!\n");
            } else {
                System.out.println("Error!!! Your password does not match. Password is " + random_password + "\n");
            }
        }
    }

    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public static String getRandomPassword() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        return String.format("%06d", number);
    }

}
