package com.tge.a04oopextandsdemo4;

public class Cook extends Employee{


    public Cook(String id, String name, int salary) {
        super(id, name, salary);
    }

    public Cook() {
    }


    @Override
    public void work(){
        System.out.println("炒菜");
    }
}
