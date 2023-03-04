package com.tge.Array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        String [] arr = new String[50];
        arr[0] = "zhangsan";
        arr[1] = "lisi";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //数组默认初始化值的规律
        //整数类型：默认初始化值0
        //小数类型：默认初始化值0.0
        //字符类型：默认初始化值'/u0000' 空格
        //布尔类型：默认初始化值flase
        //引用数据类型：默认初始化值null
        char[] arr1 = new  char[10];
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
