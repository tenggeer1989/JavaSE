package com.tge.test1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        if (price>= 100){
            System.out.println("expensive");
        }    else{
                System.out.println("cheap");
            }

    }
}
