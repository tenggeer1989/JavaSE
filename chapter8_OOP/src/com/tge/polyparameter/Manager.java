package com.tge.polyparameter;

/**
 * ClassName: Manager
 * Package: com.tge.polyparameter
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/30 - 20:09
 * Version:
 */
public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("经理" + getName() + "正在管理");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
