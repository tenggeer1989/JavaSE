package com.tge.test;

public class test15 {
    public static void main(String[] args) {
        /*
        生成验证码
        内容：可以是小写字母，也可以是大写字母，可以是数字
        规则：
        长度为5
        内容中是四位字母，1位数字。
        其中数字只有1位，但是可以出现在任意位置。*/

        //1.可以把所有的大写字母，小写字母放到一个数组中
        char[] arr=new char[52];


        //2.从数组中随机获取4次



        //3.生成一个0~9之间的随机数
        //把生成的验证码先变成一个字符数组
        //再让最后一个元素跟前面的随机位置的元素进行交换
        //交换完毕之后再变成字符串

    }
}
