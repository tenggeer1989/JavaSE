package com.tge.properties;

import java.io.*;
import java.util.Properties;

/**
 * ClassName: Properties01
 * Package: com.tge.properties
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/16 - 22:37
 * Version:
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {
        // 1.创建对象
        Properties properties = new Properties();


        // 2. 加载配置文件
        properties.load(new FileReader("chapter19_iostream\\src\\mysql.properties"));
        // 3. 把k-v显示到控制台
        //properties.list(System.out);
        // 4 . 根据key 获取对应的值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        String ip = properties.getProperty("ip");
        System.out.println("用户名="+ user);
        System.out.println("密码="+ pwd);
        System.out.println("地址="+ ip);

    }
}
