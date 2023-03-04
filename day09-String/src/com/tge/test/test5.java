package com.tge.test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        System.out.println("please enter string:");
        String s = sc.next();*/

        String newS = str("agfdsg");
        System.out.println(newS);
    }

    public static String str(String s) {
        String result ="";
        //倒着编译即可
        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            result = result + c;
        }
        return result;
    }
}


