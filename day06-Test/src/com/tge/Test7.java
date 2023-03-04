package com.tge;

public class Test7 {
    public static void main(String[] args) {
        //需求：
        //把整数上的每一位都添加到数组中
        //反向推导

        //1.计算出数组的长度
        int number = 45889;
        int temp = number;
        //定义一个变量进行统计
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        //2.定义数组
        //动态初始化
        int[] arr = new int[count];
        //3.把整数上的每一位都添加到数组当中
        while (temp != 0) {
            //获取temp里面的每一位数组
            int ge = temp % 10;
            //再去掉右边的数字
            temp = temp / 10;
            //把当前获取到的个位添加到数组当中
            arr[count - 1] = ge;
            count--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

