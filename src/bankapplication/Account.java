package bankapplication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 1609963
 */
class Account {

    private String name;
    private double balance;

    public Account(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    Account(double openingBalance, String n) {
        name = n;
        if (openingBalance > 0) {
            this.balance = openingBalance;
        } else {
            this.balance = 0.0;
        }
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public String toString() {
        String info = "account held by " + this.getName();
        info = info + " has balance " + this.getBalance();
        return info;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void transfer(double amount, Account other) {
        this.withdraw(amount);
        other.deposit(amount);
    }

    public boolean hasSufficientFunds(double amount) {
        boolean isFunded;
        if (getBalance() >= amount) {
            isFunded = true;
        } else {
            isFunded = false;
        }
        return isFunded;
    }

    public double close() {
        double closingBalnce = this.balance;
        this.balance = 0.0;
        return closingBalnce;
    }
}
