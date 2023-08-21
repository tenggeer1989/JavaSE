package com.tge.test;

/**
 * ClassName: WhileTest1
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/22 - 23:03
 * Version:
 */
public class WhileTest1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100){
            if(i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
