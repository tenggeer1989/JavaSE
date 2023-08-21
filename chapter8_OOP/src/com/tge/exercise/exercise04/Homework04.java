package com.tge.exercise.exercise04;

/**
 * ClassName: Homeword04
 * Package: com.tge.exercise.exercise04
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/2 - 9:32
 * Version:
 */
public class Homework04 {
    public static void main(String[] args) {
        // CheckingAccount checkingAccount = new CheckingAccount(1000);
        // checkingAccount.withdraw(10);
        // checkingAccount.deposit(9);
        // checkingAccount.withdraw(10);
        // System.out.println(checkingAccount.getBalance());
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());

        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());
    }
}
