package com.tge.exercise;

/**
 * ClassName: Exercise1
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/27 - 22:40
 * Version:
 */
// 创建一个类判断double数组的最大值
public class Exercise1 {
    public static void main(String[] args) {
        A01 a = new A01();
        // double[] arr = {1.1, 23.56, 90.1, -123.7};
        double[] arr = {};
        Double max = a.getMax(arr);
        if (max != null) {
            System.out.println("该数组最大值为" + max);
        } else {
            System.out.println("输入的数组不能为空或null");
        }
    }
}

class A01{
    public Double getMax(double[] arr){
        if(arr == null || arr.length <= 0){
            return null;
        }

        double max = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
