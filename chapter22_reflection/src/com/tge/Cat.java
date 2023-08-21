package com.tge;

/**
 * ClassName: com.tge.Cat
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/21 - 16:57
 * Version:
 */
public class Cat {
    private String name = "招财猫";
    public int age = 10; //public的

    public Cat() {} //无参构造器

    public Cat(String name) {
        this.name = name;
    }

    public void hi() { //常用方法
        //System.out.println("hi " + name);
    }
    public void cry() { //常用方法
        System.out.println(name + " 喵喵叫..");
    }
}
