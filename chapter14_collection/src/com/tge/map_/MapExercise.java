package com.tge.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: MapExercise
 * Package: com.tge.map_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/11 - 21:53
 * Version:
 */
public class MapExercise {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        hashMap.put(new Employee("smith", 10000, 1).getId(), new Employee("smith", 10000, 1));
        hashMap.put(new Employee("tom", 20000, 2).getId(), new Employee("tom", 20000, 2));
        hashMap.put(new Employee("jack", 30000, 3).getId(), new Employee("jack", 30000, 3));

        Set keyset = hashMap.keySet();

        System.out.println("=====第一种方式======");
        for (Object key : keyset) {
            if (((Employee) (hashMap.get(key))).getSal() > 18000)
                System.out.println(hashMap.get(key));
        }

        System.out.println("=====第一种方式======");
        Set entrySet = hashMap.entrySet();

        for (Object entry : entrySet) {
            Map.Entry m = (Map.Entry) entry;
            if (((Employee) (m.getValue())).getSal() > 18000) {
                System.out.println(m.getKey() + "-" + m.getValue());
            }
        }
    }
}


class Employee {
    private String name;
    private double sal;
    private int id;

    public Employee(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
