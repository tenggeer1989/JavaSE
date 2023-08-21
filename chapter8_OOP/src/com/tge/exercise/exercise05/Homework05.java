package com.tge.exercise.exercise05;

/**
 * ClassName: Homework05
 * Package: com.tge.exercise.exercise05
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/2 - 10:23
 * Version:
 */
public class Homework05 {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("zhangsan",22,"麻醉师","男",5000);
        Doctor d2 = new Doctor("zhangsan",22,"麻醉师","女",5000);

        boolean equals = d1.equals(d2);
        System.out.println(equals);

    }
}
