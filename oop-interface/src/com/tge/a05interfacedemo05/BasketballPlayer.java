package com.tge.a05interfacedemo05;

public class BasketballPlayer extends Athlete {

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习");
    }



}
