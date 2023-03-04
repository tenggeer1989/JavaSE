package com.tge.StringBuilderDemo;

import java.util.Scanner;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //链式编程
        //当我们在调用一个方法的时候，不需要用变量接收他的结果，可以继续调用的方法

        int len = getString().substring(1).replace("A", "Q").length();
        System.out.println(len);
    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a String:");
        String str = sc.next();
        return str;
    }
}
