package com.tge.test;

/**
 * ClassName: RecursionTest1
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/26 - 22:59
 * Version:
 */

//斐波那契  1,1,2,3,5,8,13....
public class RecursionTest1 {
    public static void main(String[] args) {

        int sum = fn(8);
        System.out.println(sum);
    }

    public static int fn(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return  fn(n - 2) + fn(n - 1);
        }
    }
}
