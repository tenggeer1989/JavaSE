package com.tge.exercise.exercise04;

/**
 * ClassName: BankAccount
 * Package: com.tge.exercise.exercise04
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/2 - 0:03
 * Version:
 */
public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }
}
