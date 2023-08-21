package com.tge.test;

import java.util.Scanner;

/**
 * ClassName: SwitchTest2
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/22 - 22:01
 * Version:
 */
public class SwitchTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter month:");
        int month = sc.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("this month is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("this month is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("this month is autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("this month is winter");
                break;
            default:
                System.out.println("Numbers do not follow the rules");
        }
    }
}
