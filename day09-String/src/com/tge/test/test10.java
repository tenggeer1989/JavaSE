package com.tge.test;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a String:");
        String str = sc.next();
        /*StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String newStr = sb.toString();*/

        String newStr = new StringBuilder().append(str).reverse().toString();

        if(str.equals(newStr)){
            System.out.println("该字符串为对称字符串");
        }else {
            System.out.println("该字符串为非对称字符串");
        }
    }
}
