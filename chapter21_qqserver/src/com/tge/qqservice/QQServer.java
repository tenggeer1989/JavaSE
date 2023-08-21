package com.tge.qqservice;

import com.tge.qq.Message;
import com.tge.qq.MessageType;
import com.tge.qq.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName: QQService
 * Package: com.tge.qqserver
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/19 - 9:44
 * Version:
 */
public class QQServer {

    private ServerSocket ss = null;
    // 创建一个集合，存放多个用户
    // hashmap 没有处理线程安全
    // ConcurrentHashMap可以处理多线程
    private static ConcurrentHashMap<String,User> validUsers = new ConcurrentHashMap<>();

    static {
        validUsers.put("100", new User("100", "123456"));
        validUsers.put("200", new User("200", "123456"));
        validUsers.put("300", new User("300", "123456"));
        validUsers.put("至尊宝", new User("至尊宝", "123456"));
        validUsers.put("紫霞仙子", new User("紫霞仙子", "123456"));
        validUsers.put("菩提老祖", new User("菩提老祖", "123456"));
    }

    // 验证用户是否有效方法
    private boolean checkUser(String userId,String passwd){
        User user = validUsers.get(userId);
        if (user == null){//用户不存在
            return false;
        }
        if (user.getPassword().equals(passwd)){
            return true;
        }

        return false;
    }

    public QQServer(){
        try {
            System.out.println("服务端在9999端口监听");
            //启动推送新闻的线程
            new Thread(new SendNewsToAllService()).start();
            ss = new ServerSocket(9999);

            while (true){// 监听是持续进行的，所以使用循环
                Socket socket = ss.accept();
                // 将等到的socket关联对象输入流
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                User u  = (User) ois.readObject();
                //得到socket关联的对象输出流
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                // 创建一个message对象
                Message message = new Message();
                // 验证
                if (checkUser(u.getUserId(), u.getPassword())){
                    message.setMsgType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    // 回复客户端
                    oos.writeObject(message);
                    // 创建一个线程，和客户端保持通信,该线程持有一个socket对象
                    ServerConnectClientThread serverConnectClientThread = new ServerConnectClientThread(socket, u.getUserId());
                    serverConnectClientThread.start();
                    // 把该线程放到集合中进行管理
                    ManageClientThreads.addManageClientThreads(u.getUserId(),serverConnectClientThread);
                }else {// 登录失败
                    System.out.println("用户 id=" + u.getUserId() + " pwd=" + u.getPassword() + " 验证失败");
                    message.setMsgType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);
                    // 登录失败，需要关闭socket
                    socket.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 如果服务器退出了while循环，说明服务器不在监听，因此关闭ServerSocket
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
