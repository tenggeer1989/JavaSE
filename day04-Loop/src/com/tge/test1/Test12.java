package com.tge.test1;

public class Test12 {
    public static void main(String[] args) {
        int[][] year = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        int yearSum = 0;
        for (int i = 0; i < year.length; i++) {
            int[] oneSeason = year[i];
            int sum = getSum(oneSeason);
            System.out.println("第" + (i + 1) + "季度的总营业额为" + sum);
            yearSum = yearSum + sum;
        }
        System.out.println("全年总营业额为" + yearSum);

    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
