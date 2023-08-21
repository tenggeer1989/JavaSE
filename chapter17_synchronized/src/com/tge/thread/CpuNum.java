package com.tge.thread;

/**
 * ClassName: CpuNum
 * Package: com.tge.synchronized_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/14 - 0:30
 * Version:
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        int i = runtime.availableProcessors();

        System.out.println(i);
    }
}
