package com.tge.qqclient.service;

import com.tge.qq.Message;
import com.tge.qq.MessageType;

import java.io.*;

/**
 * ClassName: FileClientService
 * Package: com.tge.qqclient.service
 * Description:该类完成文件传输服务
 *
 * @Author: tge
 * @Create: 2023/8/21 - 12:57
 * Version:
 */
public class FileClientService {

    public static void sendFileToOne(String src,String dest,String senderId,String getterId){

        //读取src文件
        Message message = new Message();
        message.setMsgType(MessageType.MESSAGE_FILE_MES);
        message.setSender(senderId);
        message.setReceiver(getterId);
        message.setSrc(src);
        message.setDest(dest);

        // 需要文件读取
        FileInputStream fileInputStream = null;
        byte[] fileBytes = new byte[(int) new File(src).length()];

        try {
            fileInputStream = new FileInputStream(src);
            fileInputStream.read(fileBytes);
            message.setFileBytes(fileBytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        //发送
        try {
            ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread.clientConnectServerThread(senderId).getSocket().getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 提示信息
        System.out.println(senderId + "给" + getterId + "发送文件" + src + "到对方电脑目录" + dest);
    }
}
