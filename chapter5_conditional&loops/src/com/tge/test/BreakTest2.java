package com.tge.test;

/**
 * ClassName: BreakTest2
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/24 - 22:10
 * Version:
 */
public class BreakTest2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i <= 100;i++){
            sum += i;
            if(sum > 20){
                System.out.println("i =" + i);
                break;
            }
        }
        System.out.println("sum =" + sum);
    }
}
