package com.tge.test1;

import java.util.Scanner;

public class LogicOperatorTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter count1 :");
        int count1 = sc.nextInt();
        System.out.println("please enter count2 :");
        int count2 = sc.nextInt();

        System.out.println(count1==6 || count2==6 );
        System.out.println((count1 + count2)% 6 == 0 );

    }
}
