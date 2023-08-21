package com.tge.exercise;

/**
 * ClassName: Exercise3
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/24 - 23:14
 * Version:
 */

//输出1-100之间的不能被5整除的数，每5个一行
public class Exercise3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 5 != 0){
                count++;
                System.out.print(i + "\t");
                if(count == 5){
                    count = 0;
                    System.out.println();
                }
            }
        }
    }
}
