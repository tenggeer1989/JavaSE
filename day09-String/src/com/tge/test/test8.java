package com.tge.test;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your id :");
        String id = sc.next();

        //截取年
        String year = id.substring(6, 10);
        //截取月
        String month = id.substring(10, 12);
        //截取日
        String day = id.substring(12, 14);
        //截取手机号码后面四位
        char gender = id.charAt(16);
        //利用ASCII码表进行转换
        //'0'----> 48


        System.out.println("人物信息为：");
        System.out.println("出生年月日：" + year + "年" + month + "月" + day + "日");
        if ((gender-48) % 2 == 0) {
            System.out.println("性别为：女");
        }else {
            System.out.println("性别为：男");
        }
    }
}
