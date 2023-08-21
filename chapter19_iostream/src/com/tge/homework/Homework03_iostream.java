package com.tge.homework;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.io.*;
import java.util.Properties;

/**
 * ClassName: Homework03_iostream
 * Package: com.tge.homework
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/17 - 0:03
 * Version:
 */
public class Homework03_iostream {
    public static void main(String[] args) throws IOException {
        // 创建一个dog的properties文件
        Properties properties = new Properties();
        String filePath = "chapter19_iostream\\src\\dog.properties";
        properties.setProperty("name","tom");
        properties.setProperty("age","5");
        properties.setProperty("color","red");

        properties.store(new FileOutputStream(filePath),null);

        // 将properties中的属性加到dog对象中
        properties.load(new FileReader(filePath));
        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.getProperty("color");


        Dog dog = new Dog(name,age,color);
        System.out.println(dog);

        // 将dog对象进行序列化到dog.dat文件中
        String serFilePath = "e:\\fileTest1\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);

        oos.close();


    }

    @Test
    //反序列化
    public void parse() throws IOException, ClassNotFoundException {
        String serFilePath = "e:\\fileTest1\\dog.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFilePath));
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
