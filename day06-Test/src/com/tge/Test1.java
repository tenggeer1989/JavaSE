package com.tge;


import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your price :");
        int price = sc.nextInt();
        System.out.println("please enter your month :");
        int month = sc.nextInt();
        System.out.println("please enter your seat :");
        int seat = sc.nextInt();
        if (month >= 5 && month <= 10) {
             price = getPrice(price, seat, 0.9, 0.85);
            /*if (seat == 1) {
                newPrice = price * 0.9;
                System.out.println(newPrice);
            } else if (seat == 2) {
                newPrice = price * 0.85;
                System.out.println(newPrice);
            } else {
                System.out.println("没有该类型的舱位");
            }*/
        } else if ((month == 11 || month == 12) || (month >= 1 && month <= 4)) {
             price = getPrice(price, seat, 0.7, 0.65);
            /* if (seat == 1) {
                newPrice = price * 0.7;
                System.out.println(newPrice);
            } else if (seat == 2) {
                newPrice = price * 0.65;
                System.out.println(newPrice);
            } else {
                System.out.println("没有该类型的舱位");
            }*/
        }

    }

    public static int getPrice(int price, int seat, double d1, double d2) {
        if (seat == 1) {
            price = (int) ( price * d1);
            System.out.println(price);
        } else if (seat == 2) {
            price = (int) ( price * d2);
            System.out.println(price);
        } else {
            System.out.println("没有该类型的舱位");
        }
        return price;
    }
}
