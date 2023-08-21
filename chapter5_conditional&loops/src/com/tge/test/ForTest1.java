package com.tge.test;

/**
 * ClassName: ForTest1
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/22 - 22:13
 * Version:
 */
public class ForTest1 {
    public static void main(String[] args) {
        int sum = 0;
        int total = 0;
        for (int i = 1; i < 100; i++) {
            if(i % 9 == 0){
                sum += i;
                total++;
            }
        }
        System.out.println("1~100之间9的倍数共有" + total +"个" + "总和为" + sum);
    }
}
