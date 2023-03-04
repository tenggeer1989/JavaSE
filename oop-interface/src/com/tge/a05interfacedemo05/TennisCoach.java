package com.tge.a05interfacedemo05;

public class TennisCoach extends Coach implements English{

    public TennisCoach() {
    }

    public TennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练在教如何打乒乓球");
    }


    @Override
    public void StudyEnglish() {
        System.out.println("乒乓球教练学英语");
    }
}
