package com.tge.homework;

/**
 * ClassName: Homework02
 * Package: com.tge.homework
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/6 - 10:09
 * Version:
 */
public class Homework02 {
    public static void main(String[] args) {

        int nextNum = Frock.getNextNum();
        System.out.println(nextNum);
        int nextNum1 = Frock.getNextNum();
        System.out.println(nextNum1);
        System.out.println("=============");
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();

        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());
    }
}

class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public static int getCurrentNum() {
        return currentNum;
    }

    public static void setCurrentNum(int currentNum) {
        Frock.currentNum = currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static int getNextNum() {
        Frock.currentNum += 100;
        return Frock.currentNum;
    }
}