package com.tge.test1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter number :");
        int x = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= x-1; i++){
            if (x % i == 0 ){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(x + "是一个质数");
        }else {
            System.out.println(x + "不是一个质数");
        }
    }
}
