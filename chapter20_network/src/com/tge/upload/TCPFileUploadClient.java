package com.tge.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ClassName: TCPFileUploadClient
 * Package: com.tge.upload
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/17 - 22:37
 * Version:
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws IOException {

        // 客户端连接服务端8888端口
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        //创建读取磁盘文件的输入流
        String filePath = "E:\\download\\google download\\wallhaven-6oxgp6.jpg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));

        // bytes 就是filePath对应的字节数组
        byte[] bytes = streamToByteArray(bis);

        // 通过socket获取输出流，将bytes数据发给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bis.close();
        socket.shutdownOutput();//设置写入数据的结束标记

        // 接收从服务端回复的消息
        InputStream inputStream = socket.getInputStream();
        String s = streamToString(inputStream);
        System.out.println(s);

        //关闭流
        bos.close();
        socket.close();

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

    public static String streamToString(InputStream is) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null){
            builder.append(line + "\r\n");
        }
        return builder.toString();
    }
}
