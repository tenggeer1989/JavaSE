package com.tge.test;

/**
 * ClassName: MethodTest3
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/26 - 22:20
 * Version:
 */
public class MethodTest3 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "zhangsan";
        p.age = 18;
        p.gender = "male";
        System.out.println(p.name + p.age + p.gender);

        Person newP = copyPerson(p);
        System.out.println(newP.name + newP.age + newP.gender);
    }

    public static Person copyPerson(Person p){
        Person newP = new Person();
        newP.name = p.name;
        newP.age = p.age;
        newP.gender = p.gender;
        return newP;
    }
}

class Person {
    String name;
    int age;
    String gender;
}