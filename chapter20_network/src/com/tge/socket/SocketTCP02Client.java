package com.tge.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ClassName: SocketTCP02Client
 * Package: com.tge.socket
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/17 - 22:13
 * Version:
 */
public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        // 1. 连接服务器（ip，端口）
        // 连接本机的9999端口
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("客户端 socket = " + socket.getClass());

        // 2. 连接后，生成socket，通过socket.getOutputStream()
        OutputStream outputStream = socket.getOutputStream();

        // 3. 通过输出流，写入数据到数据通道
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,server 字符流");
        bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束
        bufferedWriter.flush();//如果使用的字符流，需要手动刷新，否则数据不会写入数据通道

        // 设置结束标记
        socket.shutdownOutput();

        // 4.
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);



        // 5. 关闭流对象和socket，必须关闭
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端退出");

    }
}
