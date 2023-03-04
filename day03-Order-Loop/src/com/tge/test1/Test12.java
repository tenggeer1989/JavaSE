package com.tge.test1;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter num :");
        int x = sc.nextInt();
        //定义一个临时变量用于记录X原来的值。
        int temp = x;
        int num = 0;
        while (x != 0){
            //从右往左获取每一位
            int ge = x % 10;
            //修改x记录的值
            x = x / 10;
            //把当前获取的数字拼接到最右边
            num = num * 10 + ge;
        }
        System.out.println(num);
        if (num == temp){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        }
}

