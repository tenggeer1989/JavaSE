package com.tge;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        int[] getScore = getScore();

        int max = getMax(getScore);
        int min = getMin(getScore);
        int result = finalResult(getScore, max, min);
    }

    public static int finalResult(int arr[], int max, int min) {
        int finalScore = 0;
        for (int i = 0; i < arr.length; i++) {
            finalScore += arr[i];
        }
        int result = (finalScore - max - min) / (arr.length - 2);
        System.out.println(result);
        return result;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int[] getScore() {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("第" + (i + 1) + "号评委分数");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
                i++;
            } else {
                System.out.println("成绩超出范围，请重新输入");
            }
        }
        return arr;
    }
}