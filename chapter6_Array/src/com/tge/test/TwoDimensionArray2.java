package com.tge.test;

/**
 * ClassName: TwoDimensionArray2
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/25 - 22:40
 * Version:
 */

// 杨辉三角
public class TwoDimensionArray2 {
    public static void main(String[] args) {
        int[][] arr = new int[10][];

        for (int i = 0; i < arr.length; i++) {
            // 实现每个一维数组元素多1个
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                //每行第一个和最后一个永远是1
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
