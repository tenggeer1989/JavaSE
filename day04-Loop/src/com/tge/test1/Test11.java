package com.tge.test1;

import java.util.Random;

public class Test11 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            int random = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[random];
            arr[random] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
