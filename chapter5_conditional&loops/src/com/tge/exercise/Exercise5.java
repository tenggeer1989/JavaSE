package com.tge.exercise;

/**
 * ClassName: Exercise5
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/24 - 23:25
 * Version:
 */
//求 1-1/2+1/3-1/4+。。。。1/100的和
public class Exercise5 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum -= 1.0 / i;
            } else {
                sum += 1.0 / i;
            }
        }
        System.out.println(sum);
    }
}
