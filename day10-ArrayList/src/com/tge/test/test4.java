package com.tge.test;

import java.util.ArrayList;


public class test4 {
    public static void main(String[] args) {
        ArrayList<Stuedent> list = new ArrayList<>();

        Stuedent s1 = new Stuedent("zhangsan",23);
        Stuedent s2 = new Stuedent("lisi",22);
        Stuedent s3 = new Stuedent("wangwu",25);

        list.add(s1);
        list.add(s2);
        list.add(s3);




        for (int i = 0; i < list.size(); i++) {
            Stuedent s = list.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
