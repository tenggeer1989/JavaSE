package com.tge.exercise.exercise01;

/**
 * ClassName: Homework01
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/1 - 22:06
 * Version:
 */
public class Homework01 {
    public static void main(String[] args) {
        Person p1 = new Person("zhangsan", 18, "singer");
        Person p2 = new Person("lisi", 15, "student");
        Person p3 = new Person("wangwu", 20, "worker");

        int[] arr = new int[3];
        arr[0] = p1.getAge();
        arr[1] = p2.getAge();
        arr[2] = p3.getAge();
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
