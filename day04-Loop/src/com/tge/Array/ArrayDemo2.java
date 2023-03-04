package com.tge.Array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //1.获取数组中的元素
        //格式： 数组名[索引]
        int [] age = {15,14,15,16,17};
        int number = age[0];
        System.out.println(number);
        System.out.println(age[4]);

        //2.把数据存储到数组中
        //格式： 数组名[索引]=具体数据/变量；
        //一旦覆盖之后原来的数据无法恢复。
        age[3] = 20;
        System.out.println(age[3]);
    }
}
