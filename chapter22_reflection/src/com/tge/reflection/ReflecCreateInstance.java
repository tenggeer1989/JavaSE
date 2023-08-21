package com.tge.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * ClassName: ReflecCreateInstance
 * Package: com.tge.reflection
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/21 - 22:19
 * Version:
 */
public class ReflecCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //1. 先获取到User类的Class对象
        Class<?> userClass = Class.forName("com.tge.reflection.User");
        //2. 通过public的无参构造器创建实例
        Object o = userClass.newInstance();
        System.out.println(o);
        //3. 通过public的有参构造器创建实例
        //3.1 先得到对应构造器
        Constructor<?> constructor = userClass.getConstructor(String.class);
        //3.2 创建实例，并传入实参
        Object zs = constructor.newInstance("zs");
        System.out.println("zs=" + zs);
        //4. 通过非public的有参构造器创建实例
        //4.1 得到private的构造器对象
        Constructor<?> constructor1 = userClass.getDeclaredConstructor(int.class, String.class);
        //4.2 创建实例
        //暴破【暴力破解】 , 使用反射可以访问private构造器/方法/属性
        constructor1.setAccessible(true);
        Object user2 = constructor1.newInstance(100, "lisi");
        System.out.println("user2=" + user2);
    }
}


class User {
    private int age = 10;
    private String name = "zhangsan";

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "User [age=" + age + ", name=" + name + "]";
    }
}
