package com.tge.test4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //键盘录入
        //第一套体系
        //nextInt();接收整数
        //nextDouble();接收小数
        //next();接收字符串
        //遇到空格，制表符，回车就停止接收。

        //第二套体系
        //nextLine();接收字符串
        //可以接收空格，制表符，遇到回车才停止接收

        //1.创建一个数组
        Car[] arr = new Car[3];


        //2.创建三个商品对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("please enter your branch");
            String branch = sc.next();
            c.setBranch(branch);
            System.out.println("please enter your price");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("please enter your color");
            String color = sc.next();
            c.setColor(color);
            //3.把汽车添加到数组中
            arr[i]=c;
        }

        //4.遍历
        for (int i = 0; i < arr.length; i++) {
            //Product product = arr[i];
            System.out.println(arr[i].getBranch()+","+arr[i].getPrice()+","+arr[i].getColor());
        }
    }
}
