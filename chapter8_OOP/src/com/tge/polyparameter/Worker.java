package com.tge.polyparameter;

/**
 * ClassName: Worker
 * Package: com.tge.polyparameter
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/30 - 20:07
 * Version:
 */
public class Worker extends Employee {

    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("普通员工" + getName() + "正在工作");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
