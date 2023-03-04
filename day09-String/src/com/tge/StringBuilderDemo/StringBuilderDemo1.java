package com.tge.StringBuilderDemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder("abc");


        //2.添加元素
       /* sb.append(1);
        sb.append(2.3);
        sb.append(true);*/
        //abc12.3true

        //3.反转
        sb.reverse();//cba

        //4.获取长度
        int lenth = sb.length();
        System.out.println(lenth);//3


        //打印
        //普及：
        //因为StringBuilder是Java已经写好的类
        //打印对象不是地址值而是属性值
        System.out.println(sb);//用空参构造打印，结果不是地址，是空的
    }
}
