package com.tge.test;

/**
 * ClassName: TwoDimensionArray1
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/25 - 22:18
 * Version:
 */


/*1
  2 2
  3 3 3*/
public class TwoDimensionArray1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        //System.out.println(arr[0]);//null
        for (int i = 0; i < arr.length; i++) {
            //在刚开始时每个数组没有空间值为null，通过循环对每个数组开i+1个空间，便于后续赋值
            arr[i] = new int [i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
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
