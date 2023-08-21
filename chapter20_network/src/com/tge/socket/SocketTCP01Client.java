package com.tge.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ClassName: SocketTCP01Client
 * Package: com.tge.socket
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/17 - 10:28
 * Version:
 */
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        // 1. 连接服务器（ip，端口）
        // 连接本机的9999端口
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("客户端 socket = " + socket.getClass());

        // 2. 连接后，生成socket，通过socket.getOutputStream()
        OutputStream outputStream = socket.getOutputStream();

        // 3. 通过输出流，写入数据到数据通道
        outputStream.write("hello,server".getBytes());

        // 设置结束标记
        socket.shutdownOutput();

        // 4.
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,readLen));
        }



        // 5. 关闭流对象和socket，必须关闭
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");


    }
}
