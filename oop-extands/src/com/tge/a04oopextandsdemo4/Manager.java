package com.tge.a04oopextandsdemo4;


public class Manager extends Employee{

    private int bonus;

    public Manager(String id, String name, int salary, int bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public Manager() {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work(){
        System.out.println("管理");
    }
}
