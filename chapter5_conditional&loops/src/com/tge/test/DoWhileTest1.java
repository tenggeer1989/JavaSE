package com.tge.test;

/**
 * ClassName: DoWhileTest1
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/22 - 23:12
 * Version:
 */
public class DoWhileTest1 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        do {
            if(i % 5 == 0 && i % 3 != 0){
                System.out.println("i =" + i);
                count++;
            }
            i++;

        }while (i <= 200);

        System.out.println(count);
    }
}
