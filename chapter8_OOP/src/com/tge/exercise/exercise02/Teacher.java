package com.tge.exercise.exercise02;

/**
 * ClassName: Teacher
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/1 - 22:48
 * Version:
 */
public class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary = 1000;
    private double grade;

    public Teacher(String name, int age, String post, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;

        this.grade = grade;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void introduce(){
        System.out.println("name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                ", grade=" + grade);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                ", grade=" + grade +
                '}';
    }
}
