package com.tge.a05interfacedemo05;

public class TennisPlayer extends Athlete implements English{


    public TennisPlayer() {
    }

    public TennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习乒乓球");
    }


    @Override
    public void StudyEnglish() {
        System.out.println("乒乓球运动员学习英语");
    }
}
