package com.tge;

public class Test4 {
    public static void main(String[] args) {
        //分析
        //1.定义一个数组并存储一些元素
        int[] arr = {1, 2, 3, 4, 5};
        //2.定义一个新数组的长度和老数组一致
        int[] newArr = new int[arr.length];
        //3.遍历老数组，得到每一个元素，依次存入新数组当中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
