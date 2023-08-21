package com.tge.qqclient.service;

import com.tge.qq.Message;
import com.tge.qq.MessageType;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;

/**
 * ClassName: MessageClientService
 * Package: com.tge.qqclient.service
 * Description:该类提供和服务端进行消息交互
 *
 * @Author: tge
 * @Create: 2023/8/20 - 23:27
 * Version:
 */
public class MessageClientService {

    public static void sendMessageToOne(String content,String senderId,String getterId){
        Message message = new Message();
        message.setMsgType(MessageType.MESSAGE_COMM_MES);
        message.setContent(content);
        message.setSender(senderId);
        message.setReceiver(getterId);
        message.setSendTime(new Date().toString());// 发送时间
        System.out.println(senderId + "对" + getterId + "说了" + content);

        // 拿到发送者的线程，并建立输出流发送消息
        try {
            ClientConnectServerThread clientConnectServerThread = ManageClientConnectServerThread.clientConnectServerThread(senderId);
            Socket socket = clientConnectServerThread.getSocket();
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void messageToAll(String content,String senderId){
        Message message = new Message();
        message.setMsgType(MessageType.MESSAGE_TOALL_MES);
        message.setContent(content);
        message.setSender(senderId);
        message.setSendTime(new Date().toString());// 发送时间
        System.out.println(senderId + "" + message.getSendTime() +"对大家说了" + content);

        // 拿到发送者的线程，并建立输出流发送消息
        try {
            ClientConnectServerThread clientConnectServerThread = ManageClientConnectServerThread.clientConnectServerThread(senderId);
            Socket socket = clientConnectServerThread.getSocket();
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
