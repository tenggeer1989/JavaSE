package com.tge.test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符：");
        String str = sc.next();

        int capital = 0;
        int lower = 0;
        int number = 0;
        //遍历
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                capital++;
            } else if (c >= 97 && c <= 122) {
                lower++;
            } else if (c >= 48 && c <= 57) {
                number++;
            }
        }
        System.out.println(capital + "," + lower + "," + number);
    }
}
