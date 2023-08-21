package com.tge.exercise.exercise03;

/**
 * ClassName: Homework03
 * Package: com.tge.exercise.exercise03
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/1 - 23:24
 * Version:
 */
public class Homework03 {
    public static void main(String[] args) {
        Manager m = new Manager("zhangsan",1000,20,1.2,1000);
        Worker w = new Worker("lisi",1000,20,1.0);
        m.printSalary();
        w.printSalary();
    }
}
