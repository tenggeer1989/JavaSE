package com.tge.method.test;

public class Test5 {
    public static void main(String[] args) {
            int [] arr ={11,22,33,44,55};
        int max = getmax(arr);
        System.out.println(max);
    }
    public static int getmax (int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
