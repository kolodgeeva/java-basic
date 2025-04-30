package oop.bank;

// subclass of BankAccount
public class CheckingAccount extends BankAccount {

    private double overdraftLimit = 100;

    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            System.out.println("Withdrawing $" + amount + " from checking account (with overdraft).");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}
