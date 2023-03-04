package com.tge.method.test;

public class Test2 {
    public static void main(String[] args) {
        int s1 = square(5,6);
        int s2 = square(5,20);
        if (s1 > s2){
            System.out.println("first is bigger");
        }else {
            System.out.println("second is bigger");
        }
    }
    public static int square(int len,int wid){
        int s = len * wid;
        return s;
    }
}
