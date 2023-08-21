package com.tge.exercise.exercise04;

/**
 * ClassName: CheckingAccount
 * Package: com.tge.exercise.exercise04
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/2 - 0:05
 * Version:
 */
public class CheckingAccount extends BankAccount{

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    };


    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}
