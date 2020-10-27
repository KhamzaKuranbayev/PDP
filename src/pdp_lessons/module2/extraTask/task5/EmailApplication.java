package pdp_lessons.module2.extraTask.task5;

import java.util.Scanner;

public class EmailApplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Email[] emails = new Email[5];

        emails[0] = new Email("gm.khamza@gmail.com", "Khamza", "Kuranbayev", "asd123");
        emails[1] = new Email("sardor@gmail.com", "Sardor", "Raximov", "asd123");
        emails[2] = new Email("otabek@gmail.com", "Otabek", "G'ofurov", "asd123");
        emails[3] = new Email("sanat@gmail.com", "Sanat", "Bekchanov", "asd123");
        emails[4] = new Email("araxim@gmail.com", "Abduraxim", "Jumayev", "asd123");

        while (true) {

            System.out.println("Main Menu");
            System.out.println("1. Gmail");
            System.out.println("2. List of emails");
            System.out.println("0. Exit");
            int main_choice = scanner.nextInt();

            if (main_choice == 1) {
                viewEmailList(emails, null);

                boolean bool = true;
                while (bool) {
                    System.out.print("Please, enter email address: ");
                    String email = scanner.next();

                    for (Email email1 : emails) {

                        if (email1.checkEmail(email)) {
                            boolean bool1 = true;
                            while (bool1) {
                                System.out.print("Password: ");
                                String password = scanner.next();
                                if (email1.checkPassword(password)) {

                                    boolean b = true;
                                    while (b) {
                                        System.out.println("\n" + email1.toString());
                                        if (email1.getCountUnreadMessages() > 0) {
                                            System.out.println("Unread messages: " + email1.getCountUnreadMessages());
                                        }
                                        System.out.println();
                                        printOperations();

                                        int choice = scanner.nextInt();
                                        switch (choice) {
                                            case 1:
                                                viewEmailList(emails, email1);
                                                sentEmail(emails, email1);
                                                break;
                                            case 2:
                                                viewUnread(email1);
                                                break;
                                            case 3:
                                                viewSentEmails(email1);
                                                break;
                                            case 4:
                                                viewInbox(email1);
                                                break;
                                            case 5:
                                                changePassword(email1);
                                                break;
                                            case 6:
                                                b = false;
                                                break;
                                        }

                                    }
                                    bool1 = false;
                                } else {
                                    System.out.print("The password is incorrect!\n");
                                }
                                bool = false;
                            }
                        }
                    }
                }

            } else if (main_choice == 2) {
                viewUsersList(emails);
                System.out.println();
            }
            if (main_choice == 0) {
                System.exit(0);
            }
        }

    }

    private static void changePassword(Email email) {
        boolean bool = true;
        while (bool) {
            System.out.print("\nCurrent password: ");
            String current_password = scanner.next();
            if (email.isChangePassword(current_password)) {
                System.out.print("New password (at least 4 digits): ");
                String new_password = scanner.next();
                if (validatePassword(new_password)) {
                    System.out.print("Confirm password: ");
                    String confirm_password = scanner.next();
                    if (new_password.equals(confirm_password)) {
                        email.setPassword(new_password);
                        System.out.println("The password was changed successfully!\n");
                        bool = false;
                    } else {
                        System.out.print("The passwords you entered did not match");
                    }
                } else {
                    System.out.println("A password must contain at least 4 digits, one Uppercase letter, " +
                            "one lowercase letter, one numeric value, no spaces.");
                }
            } else {
                System.out.println("The current password is incorrect!");
            }
        }
    }

    public static boolean validatePassword(String password) {
        if (password.length() < 4 || password.contains(" ")) return false;

        int countDigit = 0;
        int countUpperCase = 0;
        int countLowerCase = 0;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c))
                countDigit++;
            if (Character.isUpperCase(c))
                countUpperCase++;
            if (Character.isLowerCase(c))
                countLowerCase++;
        }
        return countDigit != 0 && countUpperCase != 0 && countLowerCase != 0;
    }

    private static void viewInbox(Email email) {
        if (!email.isEmptyBox(email.getInbox())) {
            for (int i = 0; i < 10; i++) {
                if (email.getInbox()[i] != null) {
                    System.out.println("---------------------------------------");
                    System.out.println(email.getSender(i));
                    System.out.println(email.getSubjects(i));
                    System.out.println("Message: " + email.getInbox()[i]);
                    if (email.getStatus()[i]) {
                        System.out.println("Message unread");
                    } else {
                        System.out.println("Message read");
                    }
                    System.out.print("---------------------------------------");
                }
            }
        } else {
            System.out.println("Inbox is empty!");
        }
    }

    private static void viewSentEmails(Email email) {
        if (!email.isEmptyBox(email.getOutbox())) {
            String[] all_messages = email.getOutbox();
            for (int i = 0; i < all_messages.length; i++) {
                if (all_messages[i] != null) {
                    System.out.println("---------------------------------------");
                    System.out.println(email.getSubjects(i));
                    Email receiver = email.getReceiver(i);
                    System.out.println(receiver.toString());
                    System.out.println("Message: " + email.getMessageByIndex(i));
                    System.out.print("---------------------------------------");
                }
            }
        } else {
            System.out.println("Outbox is empty!");
        }
    }

    private static void viewUnread(Email email) {

        if (email.getCountUnreadMessages() != 0) {
            String[] all_messages = email.getInbox();
            for (int i = 0; i < all_messages.length; i++) {
                if (all_messages[i] != null) {
                    System.out.println("---------------------------------------");
                    System.out.println(email.getSubjects(i));
                    Email sender = email.getSender(i);
                    System.out.println(sender.toString());
                    System.out.println("Message: " + email.getMessageByIndexInbox(i));
                    email.setStatus(i, false);
                    System.out.print("---------------------------------------");
                }
            }
        } else {
            System.out.println("You don't have unread messages!");
        }

    }

    private static void sentEmail(Email[] emails, Email sender) {

        boolean b = true;
        while (b) {
            System.out.println("New Message");
            System.out.print("To: ");
            String to = scanner.next();
            Email receiver = getEmail(emails, to);

            if (receiver != null) {
                scanner = new Scanner(System.in);

                System.out.print("Subject: ");
                String subject = scanner.nextLine();
                System.out.println("Message:");
                String message = scanner.nextLine();

                receiver.setInbox(message, subject, sender);
                sender.setOutbox(message, subject, receiver);
                System.out.println("The message sent successfully!");
                b = false;
            } else {
                System.out.println("The email was not found!\n");
            }
        }
    }

    public static Email getEmail(Email[] emails, String email) {
        for (Email email1 : emails) {
            if (email1.getEmail().equals(email))
                return email1;
        }
        return null;
    }

    private static void viewEmailList(Email[] emails, Email email) {
        System.out.println("\nList of emails:");
        System.out.println("---------------------------------");
        for (Email email1 : emails) {
            System.out.println(email1.getEmail());
        }
        System.out.println("---------------------------------");
    }

    public static void viewUsersList(Email[] emails) {
        System.out.println("\nList of Accounts:");
        System.out.println("---------------------------------");
        for (Email email : emails)
            System.out.println(email.toString());
        System.out.println("---------------------------------");
    }

    public static void printOperations() {
        System.out.println("Choose the operation:");
        System.out.println("1-Sent email");
        System.out.println("2-View unread");
        System.out.println("3-View sent emails");
        System.out.println("4-View inbox");
        System.out.println("5-Change Password");
        System.out.println("6-Log Out");
    }
}