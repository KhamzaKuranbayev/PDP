package pdp_lessons.module2.lesson3.online.pdp.uz.model;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User(1, "user1", "savriddin@mail.ru",
                "start123", "Savriddin", "Xorazm, Shavat");

        System.out.print("Old password: ");
        String old_password = scanner.nextLine();
        if (user.changePassword(old_password)) {
            System.out.print("New password: ");
            String new_password = scanner.nextLine();
            System.out.print("Confirm password: ");
            String confirm_password = scanner.nextLine();

            if (new_password.equals(confirm_password)) {
                user.setPassword(new_password);
                System.out.println("The password was changed successfully!");
            } else {
                System.out.print("The passwords you entered did not match");
            }
        } else {
            System.out.println("The old password is incorrect!");
        }
    }
}
