package com.tge.test1;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter week :");
        int week = sc.nextInt();
        switch (week) {
            case 1,2,3,4,5 -> System.out.println("weekday");
            case 6,7 -> System.out.println("weekend");
            default -> System.out.println("error");

        }
    }
}
