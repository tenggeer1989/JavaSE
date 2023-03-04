package com.tge.test4;

public class Student {
    private String name;
    private int age;

    //如果没有写任何的构造方法
    //虚拟机给我们构造一个空参构造方法
    public Student() {
        System.out.println("test");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public  void setName() {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }


}
