package com.tge.exercise;

/**
 * ClassName: Exercise2
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/27 - 22:56
 * Version:
 */
//
public class Exercise2 {
    public static void main(String[] args) {
        A02 a = new A02();
        String[] str = {"123","zhangsan","lisi","33453","wangwu"};
        String s = "lisi";
        int index = a.find(str, s);
        if (index < 0){
            System.out.println("未找到该元素");
        }else {
            System.out.println("该元素的下标为：" + index);
        }
    }
}

class A02 {
    public int find(String[] str,String s){
        for (int i = 0; i < str.length; i++) {
            if(s.equals(str[i])){
                return i;
            }
        }
        return -1;
    }
}