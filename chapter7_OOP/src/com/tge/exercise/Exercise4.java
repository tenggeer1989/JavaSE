package com.tge.exercise;

/**
 * ClassName: Exercise4
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/28 - 9:50
 * Version:
 */
public class Exercise4 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 23, 54, -3};


        A03 a = new A03();
        int[] newArr = a.copyArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(newArr[i]);
        }

    }
}

class A03 {
    public int[] copyArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
