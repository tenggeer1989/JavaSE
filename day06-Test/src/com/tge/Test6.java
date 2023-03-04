package com.tge;



public class Test6 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 3};
        //2.加密
        //加5：6 14 13 8
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        //取余10：6438
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //将所有数字翻转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //3.把数组里的每一个数字进行拼接，变成加密之后的结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);

    }
}

