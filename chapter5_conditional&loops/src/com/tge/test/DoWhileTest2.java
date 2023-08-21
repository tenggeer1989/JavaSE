package com.tge.test;

import com.sun.tools.javac.Main;

import java.util.Scanner;

/**
 * ClassName: DoWhileTest2
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/22 - 23:18
 * Version:
 */
public class DoWhileTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("老韩问：还钱吗？y/n");
            char c = sc.next().charAt(0);
            if(c == 'y'){
                break;
            }
        }while (true);
    }
}
