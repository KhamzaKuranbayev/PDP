package pdp_lessons.module2.lesson7.task3;

public class Main {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.deposit(1000);
        checkingAccount.withdraw(1500);

        if(checkingAccount.check()) {
            System.out.println("Success");
        } else {
            System.out.println("Unsuccessful");
        }

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.save();

        System.out.println(savingAccount.getBalance());
    }
}
