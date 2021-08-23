// Create an account with name, balance and account number

package com.company;

public class Account1 {

    // fields / data members
    double balance;
    String name;
    private long accountNumber;

    public Account1(double balance, String name, long accountNumber) {
        this.balance = balance;
        this.name = name;
        this.accountNumber = accountNumber;
    }


    // member functions / methods
    void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if (amount >= 0 && amount <= balance) {
            balance -= amount;
        }
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String toString(){
        return "Name: " + getName() + ", balance is: " + getBalance() + ", account number is: " + getAccountNumber();
    }
}
