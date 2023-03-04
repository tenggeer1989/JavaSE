package com.tge.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your number :");
        double a = sc.nextDouble();
        if (a > 2) {
            System.out.println("nice");
        }
    }
}
