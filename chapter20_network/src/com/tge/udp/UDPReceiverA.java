package com.tge.udp;

import java.io.IOException;
import java.net.*;

/**
 * ClassName: UDPReceiverA
 * Package: com.tge.udp
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/18 - 9:34
 * Version:
 */
public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个 DatagramSocket 对象，在9999端口接收数据
        DatagramSocket socket = new DatagramSocket(9999);

        // 2. 构建一个 对象，准备接收数据
        byte[] recBytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(recBytes, recBytes.length);
        byte[] sendBytes = "好的~".getBytes();
        DatagramPacket packet1 = new DatagramPacket(sendBytes, sendBytes.length, InetAddress.getByName("192.168.1.61"), 9998);

        // 3. 调用接收方法,将通过网络传输的 DatagramPacket 对象 填充到packet对象
        //当有数据包发送到9999端口，就接收数据，如果没有就会阻塞等待
        System.out.println("接收端A 等待接收数据");
        socket.receive(packet);
        socket.send(packet1);

        // 4. 可以把packet 进行拆包取出数据
        int length = packet.getLength();//实际接收到数据长度
        byte[] data = packet.getData();//接收到的数据
        String s = new String(data, 0, length);
        System.out.println(s);



        // 5. 关闭资源
        socket.close();
        System.out.println("A端退出");
    }
}
