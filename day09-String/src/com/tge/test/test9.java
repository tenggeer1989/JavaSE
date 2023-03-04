package com.tge.test;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {

        String[] sensitiveWord = {"TMD", "tmd", "cnm", "CNM", "sb", "MLGB"};

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your word :");
        String word = sc.next();
        String newWord = changeWord(sensitiveWord, word);
        System.out.println(newWord);

    }

    public static String changeWord(String[] arr, String word) {
        for (int i = 0; i < arr.length; i++) {
            word = word.replace(arr[i], "***");
        }
        return word;
    }
}
