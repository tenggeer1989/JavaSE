package com.tge.qqservice;


import java.util.HashMap;
import java.util.Set;

/**
 * ClassName: ManageClientThreads
 * Package: com.tge.qqservice
 * Description:该类用于管理客户端通信的线程
 *
 * @Author: tge
 * @Create: 2023/8/19 - 10:09
 * Version:
 */
public class ManageClientThreads {
    private static HashMap<String,ServerConnectClientThread> hm = new HashMap<>();

    public static HashMap<String,ServerConnectClientThread> getHm(){
        return hm;
    }

    // 添加线程对象到集合
    public static void addManageClientThreads(String userId,ServerConnectClientThread serverConnectClientThread){
        hm.put(userId,serverConnectClientThread);
    }

    public static ServerConnectClientThread getServerConnectClientThread(String userId){
        return hm.get(userId);
    }

    // 返回用户列表
    public static String getOnlineUser(){
        //遍历，遍历hashmap
        String onlineUsersList = "";
        Set<String> keySet = hm.keySet();
        for (String s : keySet) {
            onlineUsersList = onlineUsersList + s + " ";
        }

        return onlineUsersList;
    }
    // 从集合中将线程移除
    public static void removeServerConnectClientThread(String userId){
        hm.remove(userId);
    }
}
