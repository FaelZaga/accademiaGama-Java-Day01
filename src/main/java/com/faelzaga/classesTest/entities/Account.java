package main.java.com.faelzaga.classesTest.entities;

public class Account {
    private String name;
    private double balance;

    public Account (String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public double accountIncome() {
        return balance*0.7;
    }

    @Override
    public String toString() {

        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
