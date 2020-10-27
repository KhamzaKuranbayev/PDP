package pdp_lessons.module2.lesson7.task3;

public abstract class BankAccount {

    String owner;
    double balance;

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

}
