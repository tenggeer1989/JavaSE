package com.tge.exercise.exercise03;

/**
 * ClassName: Manager
 * Package: com.tge.exercise.exercise03
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/1 - 23:27
 * Version:
 */
public class Manager extends Employee{
    private int bonus;

    public Manager(String name, double salary, int workDay, double grade, int bonus) {
        super(name, salary, workDay, grade);
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        System.out.println("该经理工资为：" + (bonus + getSalary() * getWorkDay() * getGrade()));
    }
}
