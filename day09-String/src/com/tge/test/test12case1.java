package com.tge.test;

import java.util.Scanner;

public class test12case1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;

        while (true) {
            System.out.println("please enter your num :");
            str = sc.next();
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("当前字符串不符合规则，请重新输入");
                continue;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c -48;
            StringBuilder  sb =new StringBuilder(change(number));

            System.out.print(sb);

        }

    }


    public static String change(int number) {
        String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return arr[number];
    }


    public static boolean checkStr(String str) {
        if (str.length() >= 9) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
