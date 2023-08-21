package com.tge.test;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ClassName: SmallChangeSys
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/1 - 9:14
 * Version:
 */
public class SmallChangeSys {
    public static void main(String[] args) {
        String detail = "-------------零钱通明细-------------";
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        boolean loop = true;
        while (loop) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n-------------零钱通菜单-------------");
            System.out.println("\t1 零钱通明细");
            System.out.println("\t2 收益入账");
            System.out.println("\t3 消费");
            System.out.println("\t4 退出");
            System.out.print("请选择（1-4）：");
            String i = sc.next();

            switch (i) {
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.print("收益入账金额为：");
                    money = sc.nextDouble();
                    if (money <= 0) {
                        System.out.println("输入的金额必须大于0，请重新输入");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    detail += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额为:" + balance;
                    break;
                case "3":
                    System.out.print("消费说明：");
                    String note = sc.next();
                    System.out.print("消费金额为：");
                    money = sc.nextDouble();
                    if (money <= 0) {
                        System.out.println("您输入的金额必须大于0");
                        break;
                    }
                    if (money > balance) {
                        System.out.println("您的余额不足");
                        break;
                    }
                    balance -= money;
                    date = new Date();
                    detail += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额为:" + balance;
                    break;

                case "4":
                    boolean flag = true;
                    while (flag) {
                        System.out.println("你确定要退出吗？y/n");
                        String confirm = sc.next();
                        if (confirm.equals("y")) {
                            loop = false;
                            break;
                        } else if (confirm.equals("n")) {
                            loop = true;
                            break;
                        } else {
                            System.out.println("请输入y或n");
                            flag = true;
                        }
                    }
                    break;
                default:
                    System.out.println("您输入的选项错误,请重新输入");
            }
        }
    }
}
