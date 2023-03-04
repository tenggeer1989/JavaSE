package com.tge.test;

import java.util.ArrayList;

public class test3 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();

        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');


        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            char s = list.get(i);
            if (i == list.size() - 1) {
                System.out.print(s + "]");
            } else {
                System.out.print(s + ",");
            }
        }
    }
}
