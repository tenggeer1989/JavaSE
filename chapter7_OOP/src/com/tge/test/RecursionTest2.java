package com.tge.test;

/**
 * ClassName: RecursionTest2
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/26 - 23:14
 * Version:
 */

/*
猴子吃桃，第一天吃其中的一半，并再多吃一个，以后每天都吃
一半多加一个，到10天时就剩一个，最初共多少个桃子
*/
public class RecursionTest2 {
    public static void main(String[] args) {
        int num = fn(10);
        System.out.println(num);
    }

    public static int fn(int n) {
        if (n == 1) {
            return 1;
        } else {
            // 最开始的桃子 = 前一天桃子 + 1 * 2
            return (fn(n - 1) + 1) * 2;
        }
    }
}
