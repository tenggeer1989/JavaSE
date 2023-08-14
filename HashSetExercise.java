package com.tge.hashset_;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * ClassName: HashSetExercise
 * Package: com.tge.hashset_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/11 - 0:05
 * Version:
 */
public class HashSetExercise {
    public static void main(String[] args) {
        Set hashSet = new HashSet();

        hashSet.add(new Employee("zhangsan",18));
        hashSet.add(new Employee("lisi",19));
        hashSet.add(new Employee("zhangsan",18));



        System.out.println("set = " + hashSet);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
