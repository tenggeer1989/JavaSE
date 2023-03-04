package com.tge.test1;

public class Test9 {
    public static void main(String[] args) {
        //定义一个三方变量
        int [] arr = {1,2,3,4,5};
        int temp = arr[0];
        arr [0] = arr [arr.length-1];
        arr [arr.length-1] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
