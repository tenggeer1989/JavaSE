package com.tge.qqclient.service;

import com.tge.qq.Message;
import com.tge.qq.MessageType;
import com.tge.qq.User;

import java.awt.datatransfer.DataFlavor;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * ClassName: UserClientService
 * Package: com.tge.qqclient.service
 * Description:该类完成用户登录和用户注册功能
 *
 * @Author: tge
 * @Create: 2023/8/18 - 23:24
 * Version:
 */
public class UserClientService {
    // 因为可能在其他地方使用user信息，因此作出成员信息
    private User u = new User();
    // 因为socket在其他地方也可能使用，因此作成属性
    private Socket socket;

    public boolean checkUser(String userId, String pwd) {

        boolean b = false;
        // 创建user对象
        u.setUserId(userId);
        u.setPassword(pwd);
        // 连接到服务器验证
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(u);

            // 读取从服务器回复的Message对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message ms = (Message) ois.readObject();

            if (ms.getMsgType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)){

                // 创建一个和服务器保持通信的线程 -> 创建一个类 ClientConnectServerThread
                ClientConnectServerThread clientConnectServerThread = new ClientConnectServerThread(socket);
                // 启动客户端的线程
                clientConnectServerThread.start();
                // 为了后面客户端的扩展，我们将线程放入到集合管理
                ManageClientConnectServerThread.addClientConnectServerThread(userId,clientConnectServerThread);
                b = true;
            } else {
                //如果登录失败，就不能启动和服务器通信的线程，关闭socket
                socket.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    // 向服务器端请求在线用户列表
    public void onlineFriendList(){

        Message message = new Message();

        message.setMsgType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        message.setSender(u.getUserId());

        //发送给服务器
        //得到当前线程socket对应的
        try {
            //通过之前在hashmap中存储的数据中，通过userid拿到对应的socket
            ClientConnectServerThread clientConnectServerThread =
                    ManageClientConnectServerThread.clientConnectServerThread(u.getUserId());
            Socket socket = clientConnectServerThread.getSocket();
            // 得到当前socket的输出流
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void logout(){
        Message message = new Message();
        message.setMsgType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(u.getUserId());

        //发送message
        try {
            //ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            //通过之前在hashmap中存储的数据中，通过userid拿到对应的socket
            ClientConnectServerThread clientConnectServerThread =
                    ManageClientConnectServerThread.clientConnectServerThread(u.getUserId());
            Socket socket = clientConnectServerThread.getSocket();
            // 得到当前socket的输出流
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);
            System.out.println(u.getUserId() + " 退出系统 ");
            System.exit(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
