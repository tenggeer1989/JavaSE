package com.tge.test1;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter number1 :");
        int start = sc.nextInt();
        System.out.println("please enter number2 :");
        int end = sc.nextInt();
        for (int i = start;i <= end;i++){
        if (i % 3 == 0 && i % 5 == 0) {
            count++;
            }
        }
        System.out.println(count);
    }
}

