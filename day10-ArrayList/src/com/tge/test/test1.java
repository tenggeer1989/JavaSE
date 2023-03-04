package com.tge.test;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //第一种方法
        //System.out.println(list);

        //第二种方法
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (i == list.size() - 1) {
                System.out.print(s + "]");
            } else {
                System.out.print(s + ",");
            }
        }
    }
}
