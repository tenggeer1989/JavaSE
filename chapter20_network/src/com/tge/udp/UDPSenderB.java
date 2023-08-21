package com.tge.udp;

import java.io.IOException;
import java.net.*;

/**
 * ClassName: UDPReceiverB
 * Package: com.tge.udp
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/18 - 9:34
 * Version:
 */
public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        // 创建一个 DatagramSocket 对象，在9998端口接收数据
        DatagramSocket socket = new DatagramSocket(9998);

        // 2. 构建一个 对象，准备接收数据
        byte[] sendBytes = "hello,明天吃火锅~".getBytes();
        byte[] recBytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(sendBytes, sendBytes.length, InetAddress.getByName("192.168.1.61"),9999);
        DatagramPacket packet1 = new DatagramPacket(recBytes, recBytes.length);

        socket.send(packet);
        socket.receive(packet1);

        int length = packet1.getLength();//实际接收到数据长度
        byte[] data = packet1.getData();//接收到的数据
        String s = new String(data, 0, length);
        System.out.println(s);

        // 关闭资源
        socket.close();
        System.out.println("B端退出");

    }
}
