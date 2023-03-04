package com.tge.test1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter number :");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            if(i * i == x ){
                System.out.println(i);
                break;
            }else if(i * i > x) {
                System.out.println(i-1);
                break;
            }
        }
    }
}
