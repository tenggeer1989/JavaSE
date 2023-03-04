package com.tge.test1;

import java.util.Scanner;

public class ArithmeticOperatorTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input number：");
        int count = sc.nextInt();
        System.out.println("百位是：" + count / 100 %10 );
        System.out.println("十位是：" + count / 10 % 10);
        System.out.println("个位是：" + count % 10);

        //获取个位，十位，百位
        //公式：
        //个： 数字 % 10
        //十： 数字 / 10 % 10
        //百： 数字 /100 % 10
    }
}
