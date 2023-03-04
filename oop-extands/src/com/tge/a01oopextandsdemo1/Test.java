package com.tge.a01oopextandsdemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象调用方法

        //1.创建布偶猫对象
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.catchMouse();
        rd.drink();


        //2.创建哈士奇的对象
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.breakHome();
        h.watchHome();
    }
}
