package com.tge.Array;

public class Twodimeslonarr1 {
    public static void main(String[] args) {

        //1.静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7}};
        //建议：把每一个数组单独写一行
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6, 7}
        };
        //2.获取元素
        System.out.println(arr3[0][0]);

        //3.二维数组遍历
        //每个一维数组输出在一行
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
