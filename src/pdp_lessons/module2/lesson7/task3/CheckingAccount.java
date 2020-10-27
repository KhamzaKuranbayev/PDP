package pdp_lessons.module2.lesson7.task3;

public class CheckingAccount extends BankAccount {

    String owner;
    double balance;


    @Override
    void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    void withdraw(double amount) {
        this.balance -= amount;
    }

    public boolean check() {
        return this.balance > 0;
    }

}
