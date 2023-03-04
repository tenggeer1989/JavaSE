package com.tge.test;

public class test4 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        String s = str(arr);
        System.out.println(s);

    }

    public static String str(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }

        String result = "[";
        //表示数组不是null，也不是长度为0的
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result = result + arr[i];
            } else {
                result = result + arr[i] + ", ";
            }
        }
        result = result + "]";
        return result;
    }
}

