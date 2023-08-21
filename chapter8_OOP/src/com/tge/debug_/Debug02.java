package com.tge.debug_;

import java.util.Arrays;

/**
 * ClassName: Debug02
 * Package: com.tge.debug_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/31 - 23:23
 * Version:
 */
public class Debug02 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 10, -20, 100};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
