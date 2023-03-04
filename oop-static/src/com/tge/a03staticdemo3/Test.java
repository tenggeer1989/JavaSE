package com.tge.a03staticdemo3;


import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //1.创建一个集合存储学生对象
        ArrayList<Student> list = new ArrayList<>();

        //2.创建3个学生对象
        Student student1 = new Student("zhangsan",23,"男");
        Student student2 = new Student("lisi",24,"女");
        Student student3 = new Student("wangwu",25,"男");

        list.add(student1);
        list.add(student2);
        list.add(student3);

        int max = StudentUtil.getMaxAgeStudent(list);

        System.out.println(max);


    }
}
