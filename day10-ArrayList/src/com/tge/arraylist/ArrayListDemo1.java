package com.tge.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建集合的对象
        //泛型：限定集合中存储数据的类型
        //ArrayList<String> list = new ArrayList<String>();
        //JDK7以后
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[],打印对象不是地址值，而是集合中存储数据内容


    }
}
