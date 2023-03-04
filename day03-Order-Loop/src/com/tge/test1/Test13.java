package com.tge.test1;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter num1 :");
        int x = sc.nextInt();
        System.out.println("please enter num2 :");
        int y = sc.nextInt();
        int count = 0;
        while (y >= x){
            y = y - x;
            count++;
        }
        System.out.println(y);
        System.out.println(count);
    }
}
