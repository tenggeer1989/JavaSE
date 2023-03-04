package com.tge.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符：");
        String str = sc.next();

        //遍历
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.print(c);
        }
    }
}
