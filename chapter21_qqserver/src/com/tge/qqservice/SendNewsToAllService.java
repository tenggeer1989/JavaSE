package com.tge.qqservice;

import com.tge.qq.Message;
import com.tge.qq.MessageType;
import com.tge.utils.Utility;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * ClassName: SendNewsToAllService
 * Package: com.tge.qqservice
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/21 - 14:02
 * Version:
 */
public class SendNewsToAllService implements Runnable{



    @Override
    public void run() {
        while (true) {
            System.out.println("请输入服务器推送的新闻(输入exit表示退出推送服务)：");
            String news = Utility.readString(100);
            if ("exit".equalsIgnoreCase(news)){
                break;
            }
            //构建消息
            Message message = new Message();
            message.setSender("服务器");
            message.setMsgType(MessageType.MESSAGE_TOALL_MES);
            message.setContent(news);
            message.setSendTime(new Date().toString());
            System.out.println("服务器推送消息给所有人" + news);

            //HashMap<String, ServerConnectClientThread> hm = new HashMap<>();
            HashMap<String, ServerConnectClientThread> hm = ManageClientThreads.getHm();

            Set<String> keySet = hm.keySet();

            for (String s : keySet) {
                try {
                    ObjectOutputStream oos = new ObjectOutputStream(ManageClientThreads.getServerConnectClientThread(s).getSocket().getOutputStream());
                    oos.writeObject(message);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
