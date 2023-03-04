package com.tge.test1;

public class TernaryOperatorTest2 {
    public static void main(String[] args) {
        int a = 150;
        int b = 210;
        int c = 165;
        System.out.println((a > b ? a : b) > c ? (a > b ? a : b) : c);
        int temp = a > b ? a : b;
        int result = temp > c ? temp : c;
        System.out.println(result);
    }
}
