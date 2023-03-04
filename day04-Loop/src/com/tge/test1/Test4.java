package com.tge.test1;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Random r = new Random();
        //包头不包尾，包左不包右
        int random = r.nextInt(100) + 1;
        System.out.println(random);
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true){
        System.out.println("please enter num :");
        int num = sc.nextInt();
        count++;
        if (count == 3){
            System.out.println("猜中");
            break;
        }
        if (num > random) {
            System.out.println("大");
        }else if(num < random){
            System.out.println("小");
        }else {
            System.out.println("猜中");
            break;
        }
        }
    }
}
