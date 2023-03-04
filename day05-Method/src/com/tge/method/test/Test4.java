package com.tge.method.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int [] arr ={11,12,34,45,67};
        method(arr);
    }
    public static void method(int [] brr){
        System.out.print("[");
        for (int i = 0; i < brr.length; i++) {
            if (i == brr.length-1){
                System.out.print(brr[i]);
            }else {
                System.out.print(brr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
