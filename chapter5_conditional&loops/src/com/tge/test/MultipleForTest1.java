package com.tge.test;

import com.sun.tools.javac.Main;

import java.util.Scanner;

/**
 * ClassName: MutipleForTest1
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/23 - 22:13
 * Version:
 */
public class MultipleForTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalScore = 0;
        for (int i = 1; i <= 3; i++) {
            int sum = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.println("请输入第" + i + "个班的第" + j + "个学生成绩：");
                int score = sc.nextInt();
                sum += score;
            }
            System.out.println("第" + i + "个班的总成绩为：" + sum + ",平均成绩为：" + (sum / 5));
            totalScore += sum;
        }
        System.out.println("三个班总成绩为：" + totalScore + ",平均成绩为：" + (totalScore / 5));
    }
}
