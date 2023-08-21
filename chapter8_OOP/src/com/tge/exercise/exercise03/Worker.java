package com.tge.exercise.exercise03;

/**
 * ClassName: Worker
 * Package: com.tge.exercise.exercise03
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/1 - 23:24
 * Version:
 */
public class Worker extends Employee{


    public Worker(String name, double salary, int workDay, double grade) {
        super(name, salary, workDay, grade);
    }

    @Override
    public void printSalary() {
        System.out.println("该员工的工资为：" + this.getSalary() * this.getWorkDay() * getGrade());
    }
}
