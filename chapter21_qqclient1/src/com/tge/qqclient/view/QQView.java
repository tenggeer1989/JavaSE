package com.tge.qqclient.view;

import com.tge.qqclient.service.FileClientService;
import com.tge.qqclient.service.MessageClientService;
import com.tge.qqclient.service.UserClientService;
import com.tge.qqclient.utils.Utility;

/**
 * ClassName: QQView
 * Package: com.tge.qqclien.view
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/18 - 22:53
 * Version:
 */
public class QQView {

    private boolean loop = true;
    private String key;
    private UserClientService userClientService = new UserClientService();

    public static void main(String[] args) {
        new QQView().mainMenu();
        System.out.println("客户端退出系统~~~");
    }

    // 显示主菜单
    private void mainMenu() {
        while (loop) {
            System.out.println("==============欢迎登录网络通信系统==================");
            System.out.println("\t\t 1 登录系统");
            System.out.println("\t\t 9 退出系统");
            System.out.println("请输入你的选择：");

            key = Utility.readString(1);

            switch (key) {
                case "1":
                    System.out.println("请输入用户id：");
                    String userId = Utility.readString(50);
                    System.out.println("请输入密码：");
                    String password = Utility.readString(50);
                    // 需要到服务端验证用户名密码的正确性
                    if (userClientService.checkUser(userId, password)) {
                        System.out.println("==============欢迎" + userId + "登录==============");
                        // 二级菜单
                        while (loop) {
                            System.out.println("=============网络通信系统二级菜单(用户" + userId + ")=================");
                            System.out.println("\t\t 1 显示在线用户列表");
                            System.out.println("\t\t 2 群发消息");
                            System.out.println("\t\t 3 私聊消息");
                            System.out.println("\t\t 4 发送文件");
                            System.out.println("\t\t 9 退出系统");
                            System.out.println("请输入你的选择：");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    userClientService.onlineFriendList();
                                    // System.out.println("显示在线用户列表");
                                    break;
                                case "2":
                                    System.out.println("请输入想对大家说的话：");
                                    String message = Utility.readString(100);
                                    MessageClientService.messageToAll(message,userId);
                                    break;
                                case "3":
                                    System.out.println("请输入想聊天的用户号（在线）：");
                                    String getterId = Utility.readString(50);
                                    System.out.println("请输入想说的话：");
                                    String content = Utility.readString(100);
                                    // 发送给服务端
                                    MessageClientService.sendMessageToOne(content,userId,getterId);
                                    break;
                                case "4":
                                    System.out.println("请输入你想发送的文件的用户");
                                    getterId = Utility.readString(50);
                                    System.out.println("请输入发送的文件路径：");
                                    String fileSrc = Utility.readString(100);
                                    System.out.println("请输入对方保存文件的路径：");
                                    String fileDest = Utility.readString(100);
                                    FileClientService.sendFileToOne(fileSrc,fileDest,userId,getterId);
                                    break;
                                case "9":
                                    userClientService.logout();
                                    loop = false;
                                    break;
                                default:
                                    System.out.println("您输入的选项有误！！！！请重新选择");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("============登录失败================ ");
                    }
                    break;
                case "9":
                    loop = false;
                    break;
                default:
                    System.out.println("您输入的选项有误！！！！请重新选择");
                    break;
            }
        }
    }
}
