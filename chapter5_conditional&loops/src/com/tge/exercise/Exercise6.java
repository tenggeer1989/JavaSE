package com.tge.exercise;

/**
 * ClassName: Exercise6
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/24 - 23:33
 * Version:
 */
//求1 + （1+2）+ （1+2+3）+ （1+2+3+4）+。。。。+（1+2+3+。。。+100）
public class Exercise6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
