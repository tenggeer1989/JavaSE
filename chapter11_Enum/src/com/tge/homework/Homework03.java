package com.tge.homework;

/**
 * ClassName: Homework03
 * Package: com.tge.homework
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/6 - 10:26
 * Version:
 */
public class Homework03 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal animal1 = new Cat();

        animal.shout();
        animal1.shout();
    }
}

abstract class Animal {
    public abstract void shout();
}

class Cat extends Animal{

    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}

class Dog extends Animal{

    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}
