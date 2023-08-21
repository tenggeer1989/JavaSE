package com.tge.test;

import java.lang.annotation.ElementType;
import java.util.Scanner;

/**
 * ClassName: BreakTest3
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/24 - 22:14
 * Version:
 */
public class BreakTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入账号：");
            String user = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            if (user.equals("丁真") && password.equals("666")) {
                System.out.println("登录成功");
                break;
            } else if (i == 3) {
                System.out.println("账号已锁定，请30分钟后重新尝试！！！");
            } else {
                System.out.println("账号或密码错误，还有" + (3 - i) + "次登录机会");
            }
        }


    }
}
