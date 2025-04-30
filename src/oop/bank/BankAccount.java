package oop.bank;

// Abstraction, superclass
public abstract class BankAccount {

    // fields (Encapsulation)
    private String accountHolder;
    private double balance;

    // constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // getters (Encapsulation)
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // inheritance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Polymorphism + abstraction
    public abstract void withdraw(double amount);
}
