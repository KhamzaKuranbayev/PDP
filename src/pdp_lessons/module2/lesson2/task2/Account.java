package pdp_lessons.module2.lesson2.task2;

public class Account {

    private int account_number;
    private int firstname;
    private int lastname;
    private int balance;

    public Account() {
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getFirstname() {
        return firstname;
    }

    public void setFirstname(int firstname) {
        this.firstname = firstname;
    }

    public int getLastname() {
        return lastname;
    }

    public void setLastname(int lastname) {
        this.lastname = lastname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
