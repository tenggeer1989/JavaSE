package com.tge.test;

import java.util.Scanner;

/**
 * ClassName: MethodeTest1
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/26 - 21:35
 * Version:
 */
public class MethodTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要判断的数字：");
        int num = sc.nextInt();

        boolean flag = AA(num);
        System.out.println(flag);
    }

    public static boolean AA(int num){
        return num % 2 == 0;
    }
}
