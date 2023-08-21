package com.tge.exercise;

import java.util.Scanner;

/**
 * ClassName: Exercise2
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/24 - 22:54
 * Version:
 */

//判断一个整数是不是水仙花数，
//    例如：153 = 1*1*1 + 3*3*3 + 5*5*5
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要判断的数字：");
        int num = sc.nextInt();
        int hundred = num / 100;
        int ten = num / 10 % 10;
        int ones = num % 10;

        if ((hundred * hundred * hundred + ten * ten * ten + ones * ones * ones) == num) {
            System.out.println("该数为水仙花数");
        } else {
            System.out.println("该数不是水仙花数");
        }
    }
}
