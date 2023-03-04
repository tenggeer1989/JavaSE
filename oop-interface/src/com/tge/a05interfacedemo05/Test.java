package com.tge.a05interfacedemo05;

public class Test {
    public static void main(String[] args) {
        //创建运动员或教练的对象

        TennisPlayer tp = new TennisPlayer("刘国梁", 30);

        System.out.println(tp.getName() + ", " + tp.getAge());

        tp.study();
        tp.StudyEnglish();
    }
}
