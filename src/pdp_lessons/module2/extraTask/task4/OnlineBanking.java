package pdp_lessons.module2.extraTask.task4;

import java.util.Scanner;

public class OnlineBanking {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Account[] accounts = new Account[5];

        accounts[0] = new Account(86000345, "Nurmetov Temur", "Asaka Bank", 2500, "123321");
        accounts[1] = new Account(86000346, "Ahmedov Aziz", "Milliy Bank", 1500, "123321");
        accounts[2] = new Account(86000347, "Tojiyev Ahror", "Ipoteka Bank", 3500, "123321");
        accounts[3] = new Account(86000348, "Jumanov Adham", "Sanoat qurilish Bank", 5000, "123321");
        accounts[4] = new Account(86000349, "Jalalov Samad", "Mikrokredit Bank", 4800, "123321");

        while (true) {

            System.out.println("1. Bank operations");
            System.out.println("2. List of accounts");
            System.out.println("0. Exit");
            int main_choice = scanner.nextInt();

            if (main_choice == 1) {
                viewCardList(accounts, null);

                boolean bool = true;
                while (bool) {
                    System.out.print("Please, enter card number: ");
                    int card_number = scanner.nextInt();

                    for (Account account : accounts) {

                        if (account.checkCardNumber(card_number)) {
                            if (account.isStatus()) {
                                int chance = 0;
                                boolean isBlock = true;
                                while (chance < 3) {
                                    System.out.print("Password: ");
                                    String password = scanner.next();
                                    if (account.getPassword().equals(password)) {
                                        System.out.println(account.toString() + "\n");

                                        boolean b = true;
                                        while (b) {
                                            printOperations();

                                            int choice = scanner.nextInt();
                                            switch (choice) {
                                                case 1:
                                                    System.out.println("\n" + account.toString() + "\n");
                                                    break;
                                                case 2:
                                                    deposit(account);
                                                    break;
                                                case 3:
                                                    withdraw(account);
                                                    break;
                                                case 4:
                                                    viewCardList(accounts, account);
                                                    transfer(accounts, account);
                                                    break;
                                                case 5:
                                                    changePassword(account);
                                                    break;
                                                case 0:
                                                    b = false;
                                                    break;
                                            }
                                        }
                                        isBlock = false;
                                        chance = 3;
                                    } else {
                                        chance++;
                                        System.out.print("The password is incorrect! ");
                                        if (chance < 3)
                                            System.out.println((3 - chance) + " attempt(s) left");
                                    }
                                }
                                if (isBlock) {
                                    account.setStatus(false);
                                    System.out.println("The card is blocked!\n");
                                }
                            } else {
                                System.out.println("Sorry! This card is blocked!\n");
                            }
                            bool = false;
                        }
                    }
                    if (bool)
                        System.out.println("The card number is not found!\n");
                }
            } else if (main_choice == 2) {
                viewAccountList(accounts);
                System.out.println();
            } else if (main_choice == 0) {
                System.exit(0);
            }
        }
    }

    private static void changePassword(Account account) {
        boolean bool = true;
        while (bool) {
            System.out.print("\nCurrent password: ");
            String current_password = scanner.next();
            if (account.isChangePassword(current_password)) {
                System.out.print("New password (4 letters): ");
                String new_password = scanner.next();
                if (validatePassword(new_password)) {
                    System.out.print("Confirm password: ");
                    String confirm_password = scanner.next();
                    if (new_password.equals(confirm_password)) {
                        account.setPassword(new_password);
                        System.out.println("The password was changed successfully!\n");
                        bool = false;
                    } else {
                        System.out.print("The passwords you entered did not match");
                    }
                } else {
                    System.out.println("A password must contain 4 digits, at least one Uppercase letter, " +
                            "one lowercase letter, one numeric value, no spaces.");
                }
            } else {
                System.out.println("The current password is incorrect!");
            }
        }
    }

    public static boolean validatePassword(String password) {
        if (password.length() != 4 || password.contains(" ")) return false;

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

    private static void transfer(Account[] accounts, Account account) {
        boolean b = true;
        while (b) {
            System.out.print("Which card do you want to transfer: ");
            int cart_number = scanner.nextInt();
            if (account.getCardNumber() != cart_number) {
                Account recipient = getAccount(accounts, cart_number);
                if (recipient != null) {
                    if (recipient.isStatus()) {
                        boolean b1 = true;
                        while (b1) {
                            System.out.print("Amount of money: ");
                            int amount = scanner.nextInt();
                            if (account.isWithdraw(amount)) {
                                System.out.println("Recipient: " + recipient.getCardHolder() + ". Amount of money to transfer: $" + amount);
                                boolean bool = true;
                                while (bool) {
                                    System.out.print("Enter your password: ");
                                    String password = scanner.next();
                                    if (account.getPassword().equals(password)) {
                                        account.withdraw(amount);
                                        recipient.setBalance(amount);
                                        System.out.println("The transfer was successful!\n");
                                        System.out.println(recipient.toString());
                                        bool = false;
                                    } else {
                                        System.out.println("The password is incorrect!");
                                    }
                                }
                                b1 = false;
                            } else {
                                System.out.println("Sorry! Your balance was not enough to transfer! Balance: " + account.getBalance() + "\n");
                            }
                        }
                        b = false;
                    } else {
                        System.out.println("The card was blocked!\n");
                    }
                } else {
                    System.out.println("The card is not found!\n");
                }
            } else {
                System.out.println("Attention! You chose card yourself!\n");
            }
        }
    }

    private static void withdraw(Account account) {
        System.out.print("Amount of money: ");
        int amount = scanner.nextInt();
        if (account.isWithdraw(amount)) {
            account.withdraw(amount);
            System.out.println("$" + amount + " has been deducted from your account. Your balance: $" + account.getBalance() + "\n");
        } else {
            System.out.println("Sorry! Your balance was not enough to withdraw! Balance: " + account.getBalance() + "\n");
        }
    }

    private static void deposit(Account account) {
        System.out.print("Amount of money: ");
        int amount = scanner.nextInt();
        if (amount > 0) {
            account.setBalance(amount);
        } else {
            System.out.println("Amount should be positive number");
        }
        System.out.println("$" + amount + " has been credited to your account. Your balance: $" + account.getBalance() + "\n");
    }

    public static void printOperations() {
        System.out.println("Choose the operation:");
        System.out.println("1-View");
        System.out.println("2-Deposit");
        System.out.println("3-Withdraw");
        System.out.println("4-Transfer");
        System.out.println("5-Change Password");
        System.out.println("0-Exit");
    }

    public static Account getAccount(Account[] account, int cart) {
        for (Account account1 : account) {
            if (account1.getCardNumber() == cart)
                return account1;
        }
        return null;
    }

    public static void viewCardList(Account[] accounts, Account account) {
        System.out.println("\nList of Cards:");
        System.out.println("---------------------------------");
        for (Account account1 : accounts) {
            if (!account1.equals(account))
                System.out.println(account1.getCardNumber());
        }
        System.out.println("---------------------------------");
    }

    public static void viewAccountList(Account[] accounts) {
        System.out.println("\nList of Accounts:");
        System.out.println("---------------------------------");
        for (Account account : accounts)
            System.out.println(account.toString());
        System.out.println("---------------------------------");
    }
}
