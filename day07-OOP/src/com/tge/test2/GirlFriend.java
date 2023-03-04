package com.tge.test2;

public class GirlFriend {
    //属性
    private String name;
    private double height;
    private double weight;

    //针对每一个私有化的成员变量提供get和set方法
    //set方法：给成员变量赋值
    //get方法：对外提供成员变量的值

    //作用：给成员变量name赋值

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //height
    public void setHeight(double height) {
        if (height >= 160 && height <= 170) {
            this.height = height;
        } else {
            System.out.println("不合适");
        }
    }

    public double getHeight() {
        return height;
    }

    //weight
    public void setWeight(double weight) {
        if (weight >= 100 && weight <= 110) {
            this.weight = weight;
        } else {
            System.out.println("不合适");
        }

    }

    public double getWeight() {
        return weight;
    }


    //行为
    public void eat() {
        System.out.println("eat");
    }

    public void justEat() {
        System.out.println("eat");
    }

}
