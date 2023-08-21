package com.tge.encapsulation;

/**
 * ClassName: AccountTest
 * Package: com.tge.encapsulation
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/29 - 21:54
 * Version:
 */
public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account("zha",32,"sdgf2d");
        System.out.println(a.name + "\t" + a.balance + "\t" + a.password);
    }
}
