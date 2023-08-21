package com.tge.try_;

import java.util.Scanner;

/**
 * ClassName: TrycatchExercise04
 * Package: com.tge.try_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/7 - 19:53
 * Version:
 */
public class TryCatchExercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // boolean flag = true;
        while (true) {
            try {
                System.out.println("请输入一个整数：");
                String str = sc.next();
                int num = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入必须为一个整数");
            }
        }
    }
}
