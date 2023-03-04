package com.tge.test5;


public class Test {
    public static void main(String[] args) {


        //1.创建一个数组
        Phone[] arr = new Phone[3];


        //2.创建三个商品对象
        Phone p1 = new Phone("xiaomi", 1999, "white");
        Phone p2 = new Phone("huawei", 4999, "black");
        Phone p3 = new Phone("iphone", 5999, "blue");


        //3.把汽车添加到数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;


        //4.获取三部手机的平均价格
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //Phone phone =arr[i];
            sum = sum + arr[i].getPrice();

        }
        int avg = sum / arr.length;
        System.out.println(avg);
    }
}
