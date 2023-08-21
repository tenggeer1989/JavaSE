package com.tge.test;

/**
 * ClassName: MultipleForTest2
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/23 - 22:19
 * Version:
 */
public class MultipleForTest2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + '\t');
            }
            System.out.println();
        }
    }
}
