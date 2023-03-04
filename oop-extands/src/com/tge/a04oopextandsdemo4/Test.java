package com.tge.a04oopextandsdemo4;

public class Test {
    public static void main(String[] args) {
        //创建对象并赋值调用

        Manager m = new Manager("001", "zhangsan", 15000, 2000);
        System.out.println(m.getId() + "," + m.getName() + ","
                + m.getSalary() + "," + m.getBonus());

        m.work();
        m.eat();

        Cook c = new Cook();
        c.setId("002");
        c.setName("lisi");
        c.setSalary(10000);
        System.out.println(c.getId() + "," + c.getName() + ","
                + c.getSalary());
        c.work();
        c.eat();
    }
}
