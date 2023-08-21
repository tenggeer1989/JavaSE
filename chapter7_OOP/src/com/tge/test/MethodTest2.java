package com.tge.test;

/**
 * ClassName: MethodTest2
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/26 - 21:43
 * Version:
 */
public class MethodTest2 {
    public static void main(String[] args) {
        int row = 5;
        int column = 6;
        char c = '#';
        print(row, column, c);
    }

    public static void print(int row, int column,char c){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
