package com.tge.test1;

import java.util.Random;

public class Test8 {
    public static void main(String[] args) {
        Random r = new Random();
        int sum = 0;
        int avg = 0;
        int count = 0;
        int [] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            int random = r.nextInt(101);
            arr[i] = random;
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
            avg = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {
             if (arr[i] < avg){
                 count++;
             }
        }
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(count);
    }
}
