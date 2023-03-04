package com.tge.oop;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        Phone p = new Phone();


        p.brand = "xiaomi";
        p.price = 1999.9;

        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用手机中的方法
        p.call();
        p.playGame();

        Phone p2 = new Phone();
        p2.brand = "iphone";
        p2.price = 7888;

        System.out.println(p2.brand);
        System.out.println(p2.price);

        p2.call();
        p2.playGame();

    }
}
