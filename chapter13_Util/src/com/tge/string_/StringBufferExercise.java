package com.tge.string_;

import java.util.Scanner;

/**
 * ClassName: StringBufferExercise
 * Package: com.tge.string_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/8 - 21:02
 * Version:
 */
public class StringBufferExercise {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入产品价格：");
        String price = sc.nextLine();
        StringBuffer sb = new StringBuffer(price);
        int i = sb.lastIndexOf(".");
        while (true) {
            if(i < 4) {
               break;
            }
            sb.insert(i-3,",");
            i -= 3;
        }
        System.out.println("手机价格为：" + sb);
    }
}
