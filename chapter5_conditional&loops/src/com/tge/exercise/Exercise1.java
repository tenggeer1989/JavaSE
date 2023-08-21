package com.tge.exercise;

/**
 * ClassName: Excersice1
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/24 - 22:45
 * Version:
 */
public class Exercise1 {
    public static void main(String[] args) {
        int money = 100000;
        int count = 0;
        while (money >= 0) {
            if(money < 1000){
                break;
            }
            if (money > 50000) {
                money -= (money * 0.05);
            } else {
                money -= 1000;
            }
            count++;
        }
        System.out.println("该人共经过了" + count + "次路口");
    }
}
