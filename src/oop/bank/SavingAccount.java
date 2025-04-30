package oop.bank;

// Inheritance, subclass
public class SavingAccount extends BankAccount {

    public SavingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // polymorphism
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            System.out.println("Withdrawing $" + amount + " from saving account.");
        } else {
            System.out.println("Insufficient funds in saving account.");
        }
    }

}
