package com.tge.exercise;

/**
 * ClassName: Exercise1
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/25 - 23:07
 * Version:
 */

//原数组{10 ，12， 45， 90}，添加23后，数组为{10 ，12， 23， 45， 90}
public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 45, 90};
        int num = 65;
        int index = -1;
        int[] newArr = new int[arr.length + 1];

        //先定位在哪个位置添加
        for (int i = 0; i < arr.length; i++) {
            if (num <= arr[i]) {
                index = i;
                break;
            }
            if (index == -1) {
                index = arr.length;
            }
        }
        //System.out.println(index);

        //找到位置后，需要跳过index的位置
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = num;
            } else {
                newArr[i] = arr[i - 1];
            }
        }

        // 销毁原先的数组
        arr = newArr;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
