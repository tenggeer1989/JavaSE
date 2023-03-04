package com.tge.test1;

public class ArithmeticOperatorTest2 {
    public static void main(String[] args) {
        int x = 10;
        int y = x++;
        int z = ++x;
        System.out.println(x);//12
        System.out.println(y);//10
        System.out.println(z);//12
    }
}
