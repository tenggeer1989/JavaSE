package com.tge.test1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your score :");
        int score = sc.nextInt();
        if (score >= 0 && score <= 100) {

            if (score >= 95 && score <= 100) {
                System.out.println("price is bicycle");
            } else if (score >= 90 && score <= 94) {
                System.out.println("price is playground one day");
            } else if (score >= 80 && score <= 89) {
                System.out.println("price is toy");
            } else if (score < 80) {
                System.out.println("give you a punch");
            }
        } else   {
            System.out.println("score is error");
        }
    }

}



