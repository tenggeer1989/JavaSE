package com.tge.Infiniteloop;

public class SkipLoopDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3){
                //结束本次循环
                continue;
            }
            System.out.println("小老虎在吃第" + i + "个包子");

        }
    }
}
