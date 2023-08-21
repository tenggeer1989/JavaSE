package com.tge.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPFileUploadServer
 * Package: com.tge.upload
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/17 - 22:37
 * Version:
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws IOException {

        // 1. 监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);

        // 2. 等待连接
        Socket socket = serverSocket.accept();

        // 3.读取客户端发送的数据
        // 通过socket得到输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = streamToByteArray(bis);

        // 将得到的bytes数组，写入到指定的路径
        String dstFilePath = "chapter20_netty\\src\\wallpaper.jpg";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dstFilePath));
        bos.write(bytes);
        bos.close();

        // 向客户端 回复 收到图片
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("收到图片");
        bufferedWriter.flush();
        socket.shutdownOutput();

        // 关闭其他资源
        bufferedWriter.close();
        bis.close();
        socket.close();
        serverSocket.close();
    }

    public static byte[] streamToByteArray(InputStream is) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] b = new byte[1024];
        int len;
        while ((len = is.read(b)) != -1){
            bos.write(b,0,len);
        }
        byte[] array = bos.toByteArray();
        bos.close();
        return array;
    }
}
