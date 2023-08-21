package com.tge.exercise;

/**
 * ClassName: Exercise4
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/24 - 23:21
 * Version:
 */

//输出小写a-z，以及大写Z-A
public class Exercise4 {
    public static void main(String[] args) {
        for (int i = 0; i < 26; i++) {
            System.out.print((char)('a' + i));
        }
        System.out.println();
        for (int i = 0; i < 26; i++) {
            System.out.print((char)('Z' - i));
        }
    }
}
