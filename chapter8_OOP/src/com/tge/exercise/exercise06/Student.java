package com.tge.exercise.exercise06;

/**
 * ClassName: Student
 * Package: com.tge.exercise.exercise06
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/2 - 20:18
 * Version:
 */
public class Student extends Person{

    private String stu_id;

    public Student(String name, String gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println("我承诺，我会好好学习。");
    }

    @Override
    public void play() {
        System.out.println(getName() + "爱玩足球");
    }
}
