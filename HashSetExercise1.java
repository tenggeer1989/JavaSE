package com.tge.hashset_;

/**
 * ClassName: HashSetExercise1
 * Package: com.tge.hashset_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/11 - 0:34
 * Version:
 */
import java.util.HashSet;

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter methods for year, month, and day
    // ...

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyDate myDate = (MyDate) obj;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return year * 10000 + month * 100 + day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}

class Employee1 {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee1(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    // Getter methods for name, sal, and birthday
    // ...

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee1 employee = (Employee1) obj;
        return name.equals(employee.name) && birthday.equals(employee.birthday);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + birthday.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

public class HashSetExercise1 {
    public static void main(String[] args) {
        HashSet<Employee1> employeeSet = new HashSet<>();

        MyDate birthday1 = new MyDate(1990, 8, 10);
        MyDate birthday2 = new MyDate(1995, 5, 15);
        MyDate birthday3 = new MyDate(1990, 8, 10);

        Employee1 employee1 = new Employee1("John Doe", 50000.0, birthday1);
        Employee1 employee2 = new Employee1("Jane Smith", 60000.0, birthday2);
        Employee1 employee3 = new Employee1("John Doe", 50000.0, birthday3); // Duplicate

        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);

        System.out.println(employeeSet);
    }
}

