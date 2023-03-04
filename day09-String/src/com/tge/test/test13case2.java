package com.tge.test;

import java.util.Scanner;


public class test13case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input string A");
        String s1 = sc.next();
        System.out.println("please input string B");
        String s2 = sc.next();

        boolean flag = compare(s1, s2);

        System.out.println(flag);

    }

    public static boolean compare(String s1, String s2) {
        for (int i = 0; i <= s1.length(); i++) {
            //旋转字符串
            s1 = rotate(s1);
            if (s1.equals(s2)) {
                return true;
            }
        }
        return false;
    }

    //作用：旋转字符串，把左侧的字符移动到右侧去
    //形参：旋转前的字符串
    //返回值：旋转后的字符串
    public static String rotate(String str) {
        char[] arr = str.toCharArray();
        //拿到0索引上的字符
        char first = arr[0];
        //把剩余字符依次往前挪
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        //把原来0索引的字符放到最后一个
        arr[arr.length -1] = arr[0];
        //利用字符数组创建一个字符串对象
        String result = new String(arr);
        return result;
    }
}
