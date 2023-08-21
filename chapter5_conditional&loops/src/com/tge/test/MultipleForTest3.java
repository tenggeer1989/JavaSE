package com.tge.test;

/**
 * ClassName: MultipleForTest3
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/23 - 22:47
 * Version:
 */
public class MultipleForTest3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //等边三角，打出总层数-i的空格
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            //2 * i - 1是每层星星的数量，分别为1，3，5，7，9。。。。
            for (int j = 1; j <= 2 * i - 1; j++) {
                //如果不是行首或行尾则打出空格，这样中间就是空的
                if (j == 1 || j == 2 * i - 1 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
