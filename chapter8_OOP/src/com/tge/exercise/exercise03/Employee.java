package com.tge.exercise.exercise03;

import java.awt.datatransfer.DataFlavor;

/**
 * ClassName: Employee
 * Package: com.tge.exercise.exercise03
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/1 - 23:25
 * Version:
 */
public class Employee {
    private String name;
    private double salary;
    private int workDay;
    private double grade;


    public Employee(String name, double salary, int workDay, double grade) {
        this.name = name;
        this.salary = salary;
        this.workDay = workDay;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printSalary(){
        System.out.println("该员工工资为：" + salary);
    }
}
