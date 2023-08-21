package com.tge.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: SocketTCP02Server
 * Package: com.tge.socket
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/17 - 22:14
 * Version:
 */
public class SocketTCP02Server {
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

        // 4 . IO读取，使用字符流  使用InputStreamReader将InputStream转换成字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
        // 5. 获取socket相关的输出流
        OutputStream outputStream = socket.getOutputStream();
        // 使用字符输出流方式回复
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,clint 字符流");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        // 设置结束标记
        socket.shutdownOutput();

        // 6. 关闭流和socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
