package com.tge.test;

import java.util.Scanner;
import java.util.SplittableRandom;

public class test12case2 {
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
        StringBuilder  sb =new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String s = change(c);
            sb.append(s);
        }
        System.out.print(sb);
    }


    public static String change(char number) {
        String str;
        switch (number){
            case '0' -> str = "";
            case '1' -> str = "Ⅰ";
            case '2' -> str = "Ⅱ";
            case '3' -> str = "Ⅲ";
            case '4' -> str = "Ⅳ";
            case '5' -> str = "Ⅴ";
            case '6' -> str = "Ⅵ";
            case '7' -> str = "Ⅶ";
            case '8' -> str = "Ⅷ";
            case '9' -> str = "Ⅸ";
            default -> str = "";
        }

        return str;
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
