package com.tge.test;

import java.util.ArrayList;
import java.util.Scanner;


public class test5 {
    public static void main(String[] args) {
        ArrayList<Stuedent> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Stuedent s = new Stuedent();
            System.out.println("plese enter student's name:");
            String name = sc.next();
            System.out.println("plese enter student's age:");
            int age = sc.nextInt();
            //把name和age赋值给学生
            s.setName(name);
            s.setAge(age);
            //把学生对象添加到集合中
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            Stuedent s = list.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
