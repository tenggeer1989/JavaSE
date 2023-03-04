package com.tge.a01abstractdemo01;

import org.w3c.dom.ls.LSOutput;

public class Test {

    public static void main(String[] args) {

        //Person p = new Person();


        Student s = new Student("zhangsan", 23);

        System.out.println(s.getName() + "," + s.getAge());
    }


}
