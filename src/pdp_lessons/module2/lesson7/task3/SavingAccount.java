package pdp_lessons.module2.lesson7.task3;

public class SavingAccount extends BankAccount {

    String owner;
    double balance;

    public double getBalance() {
        return balance;
    }

    @Override
    void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    void withdraw(double amount) {
        this.balance -= amount;
    }

    public void save() {
        deposit(5000);
        withdraw(3000);
    }
}
