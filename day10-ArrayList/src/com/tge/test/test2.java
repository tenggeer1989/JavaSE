package com.tge.test;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            int s = list.get(i);
            if (i == list.size() - 1) {
                System.out.print(s + "]");
            } else {
                System.out.print(s + ",");
            }
        }
    }
}
