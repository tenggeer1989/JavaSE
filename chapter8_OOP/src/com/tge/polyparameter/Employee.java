package com.tge.polyparameter;

/**
 * ClassName: Employee
 * Package: com.tge.polyparameter
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/30 - 20:05
 * Version:
 */
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getAnnual(){
        return salary * 12;
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
}
