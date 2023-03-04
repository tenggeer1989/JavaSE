package com.tge.test;

public class test11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        String str=transfer(arr);
        System.out.println(str);
    }

    public static String transfer(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (arr.length - i == 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        //由于sb是容器，不能直接返回，需要变成字符串再返回
        return sb.toString();
    }
}
