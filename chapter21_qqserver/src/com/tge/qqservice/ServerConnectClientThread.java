package com.tge.qqservice;

import com.tge.qq.Message;
import com.tge.qq.MessageType;
import com.tge.qq.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

/**
 * ClassName: ServerConnectClientThread
 * Package: com.tge.qqservice
 * Description:该类对应的对象和某个客户端保持通信
 *
 * @Author: tge
 * @Create: 2023/8/19 - 10:01
 * Version:
 */
public class ServerConnectClientThread extends Thread {

    private Socket socket;
    private String userId;

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;
    }

    public Socket getSocket(){
        return socket;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("服务器和客户端" + userId + "保持通信，读取数据.....");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                // 收消息
                Message message = (Message) ois.readObject();

                // 根据message的类型，做相应的业务
                if (message.getMsgType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)){
                    System.out.println(message.getSender() + "要在线用户列表");
                    String onlineUser = ManageClientThreads.getOnlineUser();
                    // 构建一个message对象，返回给客户端
                    Message message1 = new Message();
                    message1.setMsgType(MessageType.MESSAGE_RET_ONLINE_FRIEND);
                    message1.setContent(onlineUser);
                    message1.setReceiver(message.getSender());
                    // 写入到数据通道，返回给哭护短
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message1);

                } else if(message.getMsgType().equals(MessageType.MESSAGE_COMM_MES)){
                    System.out.println(message.getSender() + "对" + message.getReceiver() + "说了" + message.getContent());
                    ServerConnectClientThread serverConnectClientThread = ManageClientThreads.getServerConnectClientThread(message.getReceiver());
                    Socket socket = serverConnectClientThread.getSocket();
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message);
                }else if (message.getMsgType().equals(MessageType.MESSAGE_TOALL_MES)){
                    // 需要遍历所有线程集合，然后排除发送者自己
                    HashMap<String, ServerConnectClientThread> hm = ManageClientThreads.getHm();
                    Iterator<String> iterator = hm.keySet().iterator();
                    while (iterator.hasNext()) {
                        String onlineUserId =  iterator.next().toString();
                        if (!onlineUserId.equals(message.getSender())){
                            ServerConnectClientThread serverConnectClientThread = ManageClientThreads.getServerConnectClientThread(onlineUserId);
                            Socket socket = serverConnectClientThread.getSocket();
                            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                            oos.writeObject(message);
                        }
                    }
                }else if(message.getMsgType().equals(MessageType.MESSAGE_FILE_MES)){
                    ObjectOutputStream oos = new ObjectOutputStream(ManageClientThreads.getServerConnectClientThread(message.getReceiver()).getSocket().getOutputStream());
                    oos.writeObject(message);
                }else if (message.getMsgType().equals(MessageType.MESSAGE_CLIENT_EXIT)){
                    System.out.println(message.getSender() + " 退出 ");
                    // 删除集合里的线程数据，以及关闭线程
                    ManageClientThreads.removeServerConnectClientThread(message.getSender());
                    socket.close();//关闭连接
                    // 退出线程
                    break;
                } else {
                    System.out.println("其他类型的暂时不处理");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
