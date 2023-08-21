package com.tge.test;

/**
 * ClassName: ArrayTest2
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/25 - 10:03
 * Version:
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = {4, -1, 9, 10, 23};
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("数组中最大的数为：" + max + ",下标为：" + index);
    }
}
