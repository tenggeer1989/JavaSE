package com.tge.test1;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int price = 1000;
        Scanner sc =new Scanner(System.in);
        System.out.println("please show your vip level:");
        int vip = sc.nextInt();
        if (vip ==1){
            System.out.println("price is :" + (price*0.9));
        }else if (vip == 2){
            System.out.println("price is :" + (price*0.8));
        }else if (vip == 3) {
            System.out.println("price is :" + (price*0.7));
        }else {
            System.out.println("price is :" + price);
        }


    }
}
