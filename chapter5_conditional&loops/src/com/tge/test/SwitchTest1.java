package com.tge.test;

import java.util.Scanner;

/**
 * ClassName: SwitchTest
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/22 - 10:33
 * Version:
 */
public class SwitchTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your score:");
        int score = sc.nextInt();

        if (score >= 0 && score <= 100) {
            switch (score / 60) {
                case 0:
                    System.out.println("fail");
                    break;
                case 1:
                    System.out.println("pass");
                    break;
                //default:
                //    System.out.println("score is error");
            }
        } else {
            System.out.println("score is error");
        }
    }
}
