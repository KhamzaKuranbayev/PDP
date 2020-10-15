package jetbrains_academy;

import java.util.Scanner;

public class BalanceManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        Account account = new Account();
        account.setBalance(Long.parseLong(parts[0]));

        Operation operation = Operation.valueOf(parts[1]);

        Long sum = Long.parseLong(parts[2]);

        if (changeBalance(account, operation, sum)) {
            System.out.println(account.getBalance());
        }
    }

    public static boolean changeBalance(Account account, Operation operation, Long sum) {
        switch (operation) {
            case DEPOSIT:
                account.setBalance(account.getBalance() + sum);
                return true;
            case WITHDRAW:
                if (sum <= account.getBalance()) {
                    account.setBalance(account.getBalance() - sum);
                    return true;
                } else {
                    System.out.println("Not enough money to withdraw.");
                    return false;
                }
        }
        return false;
    }

    enum Operation {
        DEPOSIT,
        WITHDRAW
    }

    static class Account {

        public String code;
        private Long balance;

        public String getCode() {
            return code;
        }

        public Long getBalance() {
            return balance;
        }

        public void setBalance(Long balance) {
            this.balance = balance;
        }
    }
}



