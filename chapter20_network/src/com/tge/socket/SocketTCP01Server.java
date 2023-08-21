package com.tge.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: SocketTCP01Server
 * Package: com.tge.socket
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/17 - 10:20
 * Version:
 */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {

        // 1. 在本机 9999 端口监听
        // 前提： 没有其他服务占用该端口
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器在9999端口监听");
        // 2. 当没有客户端连接9999端口时，程序会阻塞，等待连接
        // 如果有客户端连接，返回socket对象，程序继续
        Socket socket = serverSocket.accept();

        System.out.println("服务端 socket = " + socket.getClass());
        // 3. 通过socket.getInputStream() 读取客户端写入到数据通道的数据
        InputStream inputStream = socket.getInputStream();

        // 4 . IO读取
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        // 5. 获取socket相关的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes());

        // 设置结束标记
        socket.shutdownOutput();

        // 6. 关闭流和socket
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
