package com.tge.test;

/**
 * ClassName: ArrayTest3
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/25 - 10:28
 * Version:
 */
//数组的翻转
public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77};
        int temp = 0;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
