package com.tge.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //

        String acc = "tenggeer";
        String pss = "qwer1234";

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter account");
            String account = sc.next();
            System.out.println("please enter password");
            String password = sc.next();

            boolean result1 = account.equals(acc);
            boolean result2 = password.equals(pss);
            if (result1 && result2) {
                System.out.println("登陆成功");
                break;
            } else {
                if (i < 2) {
                    System.out.println("登陆失败，您还有" + (2 - i) + "次登陆机会");
                } else {
                    System.out.println("已登陆失败3次，请稍后重试");
                }
            }
        }
    }
}
