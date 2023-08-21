package com.tge.test;

/**
 * ClassName: ThisTest
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/27 - 22:05
 * Version:
 */
public class ThisTest {
    public static void main(String[] args) {
        Person1 p1 = new Person1("zhangsan",20);
        Person1 p2 = new Person1("zhangsan",20);
        boolean b =  p1.compareTo(p2);
        System.out.println(b);

    }
}

class Person1 {
    String name;
    int age;

    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person1 p){

        return this.name.equals(p.name) && this.age == p.age;
    }

}