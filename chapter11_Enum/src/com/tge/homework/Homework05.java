package com.tge.homework;

/**
 * ClassName: Homework5
 * Package: com.tge.homework
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/6 - 10:48
 * Version:
 */

public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.method();
    }
}

class A {
    private String NAME = "lisi";
    public void method(){
        class B {
            private final String NAME = "zhangsan";

            public void show(){
                System.out.println(NAME +"\t" +  A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}
