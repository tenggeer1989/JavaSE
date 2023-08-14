package com.tge.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: Homework03_collection
 * Package: com.tge.homework
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/12 - 22:05
 * Version:
 */
public class Homework03_collection {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        Employee jack = new Employee("jack",650);
        Employee tom = new Employee("tom",1200);
        Employee smith = new Employee("smith",2900);
        hashMap.put(jack.getName(),jack.getSal());
        hashMap.put(tom.getName(),tom.getSal());
        hashMap.put(smith.getName(),smith.getSal());

        System.out.println(hashMap);
        System.out.println("========修改后========");
        hashMap.put(jack.getName(),2600.0);
        System.out.println(hashMap);
        // 为所有员工加薪100,并进行遍历
        Set entrySet = hashMap.entrySet();
        for (Object entry : entrySet) {
            Map.Entry m = (Map.Entry)entry;
            hashMap.put(m.getKey(),(Double) m.getValue() + 100);
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}

class Employee{
    private String name;
    private double sal;

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
