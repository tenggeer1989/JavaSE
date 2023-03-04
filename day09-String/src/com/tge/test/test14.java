package com.tge.test;

public class test14 {
    public static void main(String[] args) {
        //键盘输入任意字符串，打乱里面的内容

        //1.键盘输入，此处省略
        String str ="abcdefg";

        //2.打乱里面的内容
        //变成字符数组
        char[] arr =str.toCharArray();//{'a','b','c','d','e','f','g'}

        //3.打乱数组里面的内容
        //从0索引开始，跟一个随机索引进行位置的交换



        //4.把字符数组再变回字符串
        String result = new String(arr);

        System.out.println(result);
    }
}
