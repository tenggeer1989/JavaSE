package com.tge.method.test;

public class Test6 {
    public static void main(String[] args) {
        int [] arr ={1,23,45,21,56,5,323,12};
        boolean flag = contains(arr, 156);
        System.out.println(flag);
    }
    public static boolean contains(int [] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return true;

            }
        }
        return false;
    }
}
