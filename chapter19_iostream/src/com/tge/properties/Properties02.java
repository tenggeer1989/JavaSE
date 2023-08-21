package com.tge.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * ClassName: Properties02
 * Package: com.tge.properties
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/16 - 23:09
 * Version:
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        properties.setProperty("charset","utf8");
        properties.setProperty("user","tom");
        properties.setProperty("pwd","qwer1234");

        //将k-v 存储在文件中
        properties.store(new FileOutputStream("chapter19_iostream\\src\\mysql2.properties"),null);
        System.out.println("保存配置文件成功");
    }
}
