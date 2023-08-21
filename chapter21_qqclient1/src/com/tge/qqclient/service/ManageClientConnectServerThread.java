package com.tge.qqclient.service;

import java.util.HashMap;

/**
 * ClassName: ManageClientConnectServerThread
 * Package: com.tge.qqclient.service
 * Description:该类管理客户端连接到服务器端的线程类
 *
 * @Author: tge
 * @Create: 2023/8/18 - 23:55
 * Version:
 */
public class ManageClientConnectServerThread {
    // 把多个线程放入一个hashmap集合，key是用户id，value是线程
    private static HashMap<String,ClientConnectServerThread> hm = new HashMap<>();

    //将某个线程加入到集合
    public static void addClientConnectServerThread(String userId,ClientConnectServerThread clientConnectServerThread){
        hm.put(userId,clientConnectServerThread);
    }

    //通过userId 得到对应的线程
    public static ClientConnectServerThread clientConnectServerThread(String userId){
        return hm.get(userId);
    }


}
