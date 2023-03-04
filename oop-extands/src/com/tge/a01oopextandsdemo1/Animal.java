package com.tge.a01oopextandsdemo1;

public class Animal {


    //权限修饰符
    //private：子类就无法访问
    //私有：只能在本类中访问
    //爸爸的私房钱只能自己用

    public void eat(){
        System.out.println("eat");
    }

    public void drink(){
        System.out.println("drink");
    }
}
