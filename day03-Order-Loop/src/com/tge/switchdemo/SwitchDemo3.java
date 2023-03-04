package com.tge.switchdemo;

/*
  case穿透
    语句体中没有写break导致。
  执行流程：
     首先会用括号中的表达式的值跟每一个case进行匹配。
     如果匹配上了，就会执行对应的语句体，如果此时发现了break就结束switch
     如果没有发现break，就继续执行下一个case，一直到break或右大括号为止。

*/

public class SwitchDemo3 {
    public static void main(String[] args) {
        int number = 10;
        switch (number) {
            case 1:
                System.out.println("number is 1");
                //break;
            case 10:
                System.out.println("number is 10");
                //break;
            case 20:
                System.out.println("number is 20");
                //break;
            default:
                System.out.println("error");
                //break;
        }
    }
}
