package com.tge.Array;

public class Twodimeslonarr2 {
    public static void main(String[] args) {

        //动态初始化
        int[][] arr = new int[3][5];
        //给二维数组赋值
        arr[0][0] = 10;

        //遍历二维数组
        //外循环：遍历二维数组获取里面每一个一维数组
        //内循环：遍历一维数组中获取每一个元素
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
