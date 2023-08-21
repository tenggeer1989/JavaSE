package com.tge.exercise.exercise06;

/**
 * ClassName: Test
 * Package: com.tge.exercise.exercise06
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/2 - 20:28
 * Version:
 */
public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher("张飞", "男", 30, 5);
        Student s = new Student("小明", "男", 15, "00023102");


        System.out.println("老师的信息：");
        System.out.println("姓名：" + t.getName() + "\n" + "年龄：" + t.getAge() + "\n" + "性别：" + t.getGender() + "\n" + "工龄：" + t.getWork_age());
        work(t);
        t.play();
        System.out.println("------------------------");
        System.out.println("学生的信息：");
        System.out.println("姓名：" + s.getName() + "\n" + "年龄：" + s.getAge() + "\n" + "性别：" + s.getGender() + "\n" + "学号：" + s.getStu_id());
        work(s);
        s.play();
    }

    public static void work(Person p) {
        if (p instanceof Student) {
            ((Student) p).study();
        } else if (p instanceof Teacher) {
            ((Teacher) p).teach();
        } else {
            System.out.println("传入的参数有误");
        }
    }
}
