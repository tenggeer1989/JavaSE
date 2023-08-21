package com.tge.encapsulation;

/**
 * ClassName: Account
 * Package: com.tge.encapsulation
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/29 - 21:54
 * Version:
 */
public class Account {
    String name;
    double balance;
    String password;


    public Account() {
    }

    public Account(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.length() >= 2 && name.length() <= 4){
            this.name = name;
        }else {
            System.out.println("您输入的姓名位数不对");
            this.name = "huahua";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 20){
            this.balance = balance;
        }else {
            System.out.println("余额必须大于20");
            this.balance = 30.0;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() == 6){
            this.password = password;
        }else {
            System.out.println("密码必须为6位");
            this.password = "123456";
        }
    }
}
