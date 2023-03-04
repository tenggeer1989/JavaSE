package com.tge;


import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        //在没有规律的数据中随机抽取
        //可以先把数据放到数组中，再随机进行抽取一个索引
        //1.大写字母和小写字母放到数组当中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码 (char)97 ---- 'a'
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            } else {
                //(char)65 ---- 'A'
                chs[i] = (char) (39 + i);
            }
        }
        String result = "";
        //验证代码
        /*for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i]);*/
        //获取四个随机大小写字母
        for (int i = 0; i < 4; i++) {
            Random r = new Random();
            int random = r.nextInt(chs.length);
            result = result + chs[random];
        }
            //获取一个随机数字0~9
            Random r = new Random();
            int random = r.nextInt(10);
            result = result + random;
        System.out.println(result);
    }
}

