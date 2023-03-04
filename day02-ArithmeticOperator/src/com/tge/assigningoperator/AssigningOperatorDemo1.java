package com.tge.assigningoperator;

public class AssigningOperatorDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a += b;
        //等同于a = （int）（a + b）
        System.out.println(a);//30
        System.out.println(b);//20

        //+=，-=，*=，/=，%=隐含了强制类型转换
        short s = 1;
        s += 1;
        //等同于s = （short）（s + 1）
        System.out.println(s);//2


    }
}
