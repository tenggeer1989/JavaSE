package com.tge.test;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your number :");
        String number = sc.next();

        //截取手机号码前三位
        String start = number.substring(0, 3);

        //截取手机号码后面四位
        String end = number.substring(7);

        //拼接
        String result = start + "****" + end;

        System.out.println(result);
    }
}
