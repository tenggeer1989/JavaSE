package com.tge.ternaryoperator;

public class TernaryOperatorDemo1 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        int max = number1 > number2 ? number1 : number2;
        System.out.println(number1 > number2 ? number1 : number2);
    }
}
