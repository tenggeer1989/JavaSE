package com.tge.exercise;

/**
 * ClassName: Exercise2
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/25 - 23:43
 * Version:
 */
public class Exercise2 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        double avg = 0;
        double sum = 0;
        int max = 0;
        int index = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = (int) (Math.random() * 100 + 1);
            //System.out.println(num);
            arr[i] = num;
            sum += arr[i];

            if(arr[i] == 8){
                System.out.println(arr[i] + "= 8");
            }
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
            System.out.print(arr[i] + " ");
        }

        System.out.println("=============");

        avg = sum / arr.length;


        System.out.println("平均值为：" + avg + "，最大值为：" + max + "，下标为：" + index);

        // 倒叙排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
