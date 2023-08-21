package com.tge.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName: API_
 * Package: com.tge.api
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/17 - 10:02
 * Version:
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        // 1. 获取本机InetAddress对象
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println(localhost);

        // 2. 根据主机名 获取 InetAddress对象
        InetAddress host = InetAddress.getByName("tenggeer");
        System.out.println("host=" + host);

        // 3. 根据域名返回InetAddress对象
        InetAddress host1 = InetAddress.getByName("www.youtube.com");
        System.out.println("host1=" + host1);

        // 4. 通过InetAddress对象，获取对应地址
        String hostAddress = host1.getHostAddress();
        System.out.println(hostAddress);

        // 5. 通过InetAddress对象，获取对应的主机名或域名
        String hostName = host1.getHostName();
        System.out.println(hostName);
    }
}
