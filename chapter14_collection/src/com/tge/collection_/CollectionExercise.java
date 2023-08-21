package com.tge.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: CollectionIterator
 * Package: com.tge.collection_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/9 - 22:28
 * Version:
 */
public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(new Dog("哈士奇",2));
        list.add(new Dog("萨摩耶",3));
        list.add(new Dog("金毛",1));

        // 1. 迭代器
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj =  it.next();
            System.out.println(obj.toString());
        }

        System.out.println("========");
        // 2. 增强for
        for (Object o : list) {
            System.out.println(o.toString());
        }
    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
