package com.tge.a01interfacedemo01;

public class Test {
    public static void main(String[] args) {
        //创建对象

        Frog f = new Frog("小青", 1);
        System.out.println(f.getName() + "," + f.getAge());

        f.eat();
        f.swim();

        Rabbit r = new Rabbit("小白",2);
        System.out.println(r.getName() + "," + r.getAge());

        r.eat();

    }
}
