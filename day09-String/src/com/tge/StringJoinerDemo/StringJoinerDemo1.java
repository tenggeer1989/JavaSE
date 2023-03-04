package com.tge.StringJoinerDemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //1.创建一个对象，指定中间的间隔符号
        StringJoiner sj = new StringJoiner("---");

        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");

        System.out.println(sj);
    }
}
