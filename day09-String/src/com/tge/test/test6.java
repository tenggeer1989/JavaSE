package com.tge.test;


import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        //需求：输入罗马数字后转换成大写，最多七位

        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String[] arr1 = {"佰", "拾", "万", "仟", "佰", "拾", "元"};

        Scanner sc = new Scanner(System.in);
        int money;
        //先判断
        while (true) {
            System.out.println("please enter your money:");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("out of range");
            }
        }

        String str = str(arr, money);
        int count = getCount(money);
        String newStr = newStr(str, count);
        String finalStr = finalStr(newStr, arr1);
        System.out.println(finalStr);

    }

    //定义方法：把数字变成大写
    public static String str(String[] arr, int n) {
        String result = "";
        String newResult = "";
        //把每一位数字对应上大写，输出为从个位开始依次输出
        while (n != 0) {
            int ge = n % 10;
            result = result + arr[ge];
            n = n / 10;
        }
        //将从个位依次输出的大写，反过来拼
        for (int i = result.length() - 1; i >= 0; i--) {
            char c = result.charAt(i);
            newResult = newResult + c;
        }
        return newResult;
    }
    //获取数字的位数，以便决定前面补几个零
    public static int getCount(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    //前面补领
    public static String newStr(String str, int count) {
        String newStr = str;

        for (int i = 0; i < (7 - count); i++) {
            newStr = "零" + newStr;

        }
        return newStr;
    }
    //把两个字符串的每一位拼接后最终进行合并
    public static String finalStr(String newStr, String[] arr) {
        String finalStr = "";
        for (int i = 0; i < 7; i++) {
            finalStr = finalStr + newStr.charAt(i) + arr[i];
        }
        return finalStr;
    }
}
