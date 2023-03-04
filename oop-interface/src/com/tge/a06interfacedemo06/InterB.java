package com.tge.a06interfacedemo06;

public interface InterB {
    public abstract void method();

    public default void show(){
        System.out.println("InterB接口中的默认方法 ----- show");
    }
}
