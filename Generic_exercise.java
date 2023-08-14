package com.tge.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * ClassName: Generic_exercise
 * Package: com.tge.generic
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/13 - 20:55
 * Version:
 */
public class Generic_exercise {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("jack",5000,new MyDate(2,2,2000)));
        employees.add(new Employee("jack",8000,new MyDate(1,1,2000)));
        employees.add(new Employee("alice",4000,new MyDate(2,1,2000)));


        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("=======排序后==========");

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                // 对传入的数据进行验证
                if(!(o1 instanceof Employee && o2 instanceof Employee)){
                    System.out.println("类型不匹配");
                    return 0;
                }
                // 比较name
                int i = o1.getName().compareTo(o2.getName());
                if(i != 0){
                    return i;
                }
               return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}


class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private  int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        int yearDifference = year - o.getYear();
        if (yearDifference != 0){
            return yearDifference;
        }

        int monthDifference =month - o.getMonth();
        if (yearDifference != 0){
            return monthDifference;
        }

        return day - o.getDay();
    }
}

class Employee {
    private String name;
    private int sal;
    private MyDate birthday;

    public Employee(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
