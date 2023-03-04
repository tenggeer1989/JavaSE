package com.tge.test1;

public class Test7 {
    public static void main(String[] args) {
        int [] arr = {33,5,22,44,55,32};
        //求最大值最小值时不要写0，输出不严谨
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
