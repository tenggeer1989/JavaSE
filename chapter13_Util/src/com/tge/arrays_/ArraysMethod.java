package com.tge.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: ArraysMethod
 * Package: com.tge.arrays_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/8 - 22:03
 * Version:
 */
public class ArraysMethod {
    public static void main(String[] args) {
        Integer[] arr = {34, 23, 456, -89, 2};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                int i = i2 - i1;
                return i;
            }
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
