package oop.bank;

public class Main {

    public static void main(String[] args) {
        BankAccount acc1 = new SavingAccount("Alice", 500);
        BankAccount acc2 = new CheckingAccount("Bob", 300);

        BankAccount[] accounts = {acc1, acc2};

        acc1.deposit(100);
        acc2.deposit(200);

        acc1.withdraw(600);
        acc2.withdraw(600);
    }
}
