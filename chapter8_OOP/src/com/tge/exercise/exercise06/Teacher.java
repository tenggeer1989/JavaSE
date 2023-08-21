package com.tge.exercise.exercise06;

import java.awt.datatransfer.DataFlavor;

/**
 * ClassName: Teacher
 * Package: com.tge.exercise.exercise06
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/2 - 20:20
 * Version:
 */
public class Teacher extends Person {

    private int work_age;


    public Teacher(String name, String gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我承诺，我会认真教学。");
    }

    @Override
    public void play() {
        System.out.println(getName() + "爱玩象棋");
    }
}
