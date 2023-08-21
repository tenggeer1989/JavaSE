package com.tge.abstract_;

/**
 * ClassName: Animal
 * Package: com.tge.abstract_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/4 - 21:56
 * Version:
 */
public abstract class Animal {
    String name;
    int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Deprecated
    public abstract void eat();
}
