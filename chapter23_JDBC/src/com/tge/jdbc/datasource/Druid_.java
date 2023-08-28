package com.tge.jdbc.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/**
 * ClassName: Druid_
 * Package: com.tge.jdbc.datasource
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/27 - 13:00
 * Version:
 */
public class Druid_ {

    @Test
    public void testDruid() throws Exception {
        //1. 加入 Druid jar 包
        //2. 加入 配置文件 druid.properties
        //3. 创建properties对象，读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\druid.properties"));

        //4. 创建指定参数的数据源
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        Connection connection = dataSource.getConnection();
        System.out.println("连接成功");
        connection.close();
    }
}
