package com.tge.test;

/**
 * ClassName: BreakTest
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/24 - 21:59
 * Version:
 */
public class BreakTest1 {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            int random = (int) (Math.random() * 100 + 1);
            if (random == 97){
                System.out.println(random);
                break;
            }else {
                count++;
                System.out.println(random);
            }
        }
        System.out.println("共输出了"+ count + "个数");
    }
}
