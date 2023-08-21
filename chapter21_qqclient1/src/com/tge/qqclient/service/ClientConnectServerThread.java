package com.tge.qqclient.service;

import com.tge.qq.Message;
import com.tge.qq.MessageType;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * ClassName: ClientConnectServerThread
 * Package: com.tge.qqclient.service
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/18 - 23:42
 * Version:
 */
public class ClientConnectServerThread extends Thread{

    // 该线程需要持有socket
    private Socket socket;

    public ClientConnectServerThread(Socket socket){
        this.socket = socket;
    }

    public Socket getSocket(){
        return socket;
    }

    @Override
    public void run() {
        //因为thread需要在后台和服务器通信，因此做无限循环
        while (true) {
            try {
                System.out.println("客户端线程，等待读取从服务器端发送的消息");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                // 如果服务器没有发送message，线程会阻塞在这里
                Message message = (Message) ois.readObject();
                // 如果读取到的是服务端返回的在线用户数列表
                if(message.getMsgType().equals(MessageType.MESSAGE_RET_ONLINE_FRIEND)){
                    // 取出在线列表信息，并显示
                    String[] onlineUsers = message.getContent().split(" ");
                    System.out.println("==========当前在线用户列表===========");
                    for (int i = 0; i < onlineUsers.length; i++) {
                        System.out.println("用户：" + onlineUsers[i]);
                    }
                } else if(message.getMsgType().equals(MessageType.MESSAGE_COMM_MES)){
                    System.out.println(message.getSender() + "对" + message.getReceiver() + "说" + message.getContent());
                }else if(message.getMsgType().equals(MessageType.MESSAGE_TOALL_MES)){
                    System.out.println(message.getSender() + "说" + message.getContent());
                }else if(message.getMsgType().equals(MessageType.MESSAGE_FILE_MES)){
                    System.out.println(message.getSender() + "给" + message.getReceiver() + "发文件：" + message.getSrc() + "到我的电脑目录" + message.getDest());
                    // 取出message的文件字节数组，通过文件输出流写到磁盘
                    FileOutputStream fileOutputStream = new FileOutputStream(message.getDest());
                    fileOutputStream.write(message.getFileBytes());
                    fileOutputStream.close();
                    System.out.println("保存文件成功");
                }else {

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
