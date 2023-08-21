package com.tge.houserent;

import java.awt.image.LookupOp;
import java.util.Scanner;

/**
 * ClassName: HouseView
 * Package: com.tge.houserent
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/2 - 21:11
 * Version:
 */
public class HouseView {
    Scanner sc = new Scanner(System.in);
    HouseService houseService = new HouseService(10);

    public void mainMenu() {
        boolean loop = true;
        while (loop) {
            System.out.println("--------------------房屋出租系统--------------------");
            System.out.println("\t\t" + "1 新 增 房 源");
            System.out.println("\t\t" + "2 查 找 房 屋");
            System.out.println("\t\t" + "3 删 除 房 屋");
            System.out.println("\t\t" + "4 修 改 房 屋 信 息");
            System.out.println("\t\t" + "5 房 屋 列 表");
            System.out.println("\t\t" + "6 退      出");
            System.out.println("请输入您的选择（1-6）：");
            String str = sc.next();
            switch (str) {
                case "1":
                    addHouse();
                    break;
                case "2":
                    retrieveHouse();
                    break;
                case "3":
                    delHouse();
                    break;
                case "4":
                    updateHouseInfo();
                    break;
                case "5":
                    HouseList();
                    break;
                case "6":
                    loop = exitSys();
                    break;
                default:
                    System.out.println("输入的范围必须为1-6，请重新输入");
                    break;
            }
        }
    }

    public void HouseList() {
        System.out.println("--------------------房屋列表--------------------");
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态");
        House[] houses = houseService.printInfo();

        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i].toString());
        }
        System.out.println("------------------房屋列表完成------------------\n");
    }

    public void addHouse() {
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入电话：");
        String tel = sc.next();
        System.out.println("请输入地址：");
        String addr = sc.next();
        System.out.println("请输入月租：");
        int rent = sc.nextInt();
        System.out.println("请输入状态：");
        String status = sc.next();

        boolean house = houseService.add(name, tel, addr, rent, status);
        // System.out.println(info);
        if (house) {
            System.out.println("--------------------添加完成--------------------");
        } else {
            System.out.println("--------------------添加失败--------------------");
        }
    }

    public void delHouse() {
        int i = 0;


        System.out.println("请选择待删除的房屋编号：");
        i = sc.nextInt();


        while (true) {
            System.out.println("确认是否删除(Y/N),请小心选择");
            String confirm = sc.next();
            if ("y".equals(confirm) || "Y".equals(confirm)) {
                boolean house = houseService.del(i);
                if (house) {
                    System.out.println("--------------------删除完成--------------------");
                } else {
                    System.out.println("--------------------删除房屋不存在--------------------");
                }
                break;
            } else if ("n".equals(confirm) || "N".equals(confirm)) {
                break;
            } else {
                System.out.println("请输入(Y/N),请重新输入");
            }
        }
    }

    public boolean exitSys() {
        while (true) {
            System.out.println("确认要退出吗？(Y/N)");
            String confirm = sc.next();
            if ("y".equals(confirm) || "Y".equals(confirm)) {
                return false;
            } else if ("n".equals(confirm) || "N".equals(confirm)) {
                return true;
            } else {
                System.out.println("请输入(Y/N),请重新输入");
            }
        }

    }

    public void retrieveHouse() {
        System.out.println("--------------------查找房屋--------------------");
        System.out.println("请输入您要查找房屋的编号：");
        int houseNum = sc.nextInt();
        houseService.houseInfo(houseNum);
    }

    public void updateHouseInfo() {
        System.out.println("--------------------修改房屋--------------------");
        System.out.println("请输入要修改房屋信息的编号：");
        int num = sc.nextInt();
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入电话：");
        String tel = sc.next();
        System.out.println("请输入地址：");
        String addr = sc.next();
        System.out.println("请输入月租：");
        int rent = sc.nextInt();
        System.out.println("请输入状态：");
        String status = sc.next();

        houseService.update(num, name, tel, addr, rent, status);

    }
}
