package com.tge.exercise.exercise02;

/**
 * ClassName: Professor
 * Package: com.tge.exercise.exercise02
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/1 - 22:55
 * Version:
 */
public class Professor extends Teacher{


    public Professor(String name, int age, String post, double grade) {
        super(name, age, post, grade);
    }

    @Override
    public void introduce(){
        System.out.println("教授的信息为：");
        System.out.println("name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", post='" + this.getPost() + '\'' +
                ", salary=" + (this.getSalary() * this.getGrade()) +
                ", grade=" + this.getGrade());
    }

    public void eat(){
        System.out.println("chi");
    }
}
