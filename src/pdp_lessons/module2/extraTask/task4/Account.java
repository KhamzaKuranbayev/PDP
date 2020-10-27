package pdp_lessons.module2.extraTask.task4;

public class Account {

    private int cardNumber;
    private String cardHolder;
    private String cardCompany;
    private int balance;
    private String password;
    private boolean status = true; // true - Active false - Not active

    public Account(int cardNumber, String cardHolder, String cardCompany, int balance, String password) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.cardCompany = cardCompany;
        this.balance = balance;
        this.password = password;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int balance) {
        this.balance -= balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    private String getStatus() {
        if (this.status)
            return "Active";
        return "Blocked";
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isWithdraw(int amount) {
        return getBalance() >= amount;
    }

    public boolean checkCardNumber(int cardNumber) {
        return getCardNumber() == cardNumber;
    }

    public boolean isChangePassword(String current_password) {
        return getPassword().equals(current_password);
    }

    @Override
    public String toString() {
        return "Card number: " + cardNumber +
                " | Holder: " + cardHolder +
                " | Company: " + cardCompany +
                " | Balance: $" + balance +
                " | Password: " + password +
                " | Status: " + getStatus();

    }
}
