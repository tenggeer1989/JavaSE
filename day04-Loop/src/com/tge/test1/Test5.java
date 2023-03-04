package com.tge.test1;

public class Test5 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%3 == 0){
                count++;
            }

        }
        System.out.println(count);
    }
}
