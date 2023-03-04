package com.tge.test1;

import java.util.Scanner;

public class TernaryOperatorTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter tiger1 weight :");
        int weight1 = sc.nextInt();
        System.out.println("please enter tiger2 weight :");
        int weight2 = sc.nextInt();
        System.out.println(weight1 == weight2 ? "same" : "not same" );
        System.out.println(weight1 == weight2);
        String maxweight = weight1 == weight2 ? "same" : "not same";
        System.out.println(maxweight);
    }
}
