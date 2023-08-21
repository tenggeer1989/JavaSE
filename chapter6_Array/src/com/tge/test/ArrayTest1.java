package com.tge.test;

/**
 * ClassName: ArrayTest1
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/25 - 10:00
 * Version:
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        char[] arr = new char[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('A' + i);
            System.out.print(arr[i]);
        }
    }
}
