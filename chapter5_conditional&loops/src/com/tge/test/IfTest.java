package com.tge.test;

import java.util.Scanner;

/**
 * ClassName: IfElseTest
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/22 - 10:09
 * Version:
 */
public class IfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter month:");
        int month = sc.nextInt();
        System.out.println("please enter age:");
        int age = sc.nextInt();
        int price = 1000;

        if(month > 12 || month <= 0){
            System.out.println("month is error");
            //System.exit(0);
            return;
        }

        if (month >= 4 && month <= 10) {
            if (age >= 18 && age <= 60) {
                System.out.println("price is:" + (price * 0.6));
            } else if (age < 18) {
                System.out.println("price is:" + (price * 0.5));
            } else {
                System.out.println("price is:" + (price * 1 / 3));
            }
        } else {
            if(age >= 18){
                System.out.println("price is:" + (price * 0.4));
            }else {
                System.out.println("price is:" + (price * 0.2));
            }
        }


    }
}
