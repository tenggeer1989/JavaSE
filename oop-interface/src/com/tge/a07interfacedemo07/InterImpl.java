package com.tge.a07interfacedemo07;

public class InterImpl implements Inter{

    @Override
    public void method() {
        System.out.println("InterImpl重写的抽象方法");
    }

    public static void show(){
        System.out.println("InterImpl重写的抽象方法");
    }
}
