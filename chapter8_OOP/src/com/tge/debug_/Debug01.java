package com.tge.debug_;

/**
 * ClassName: Debug01
 * Package: com.tge.debug_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/31 - 23:06
 * Version:
 */
public class Debug01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
        }
        System.out.println("退出for。。。。");
    }
}
