package com.tge.jdbc.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.beans.PropertyVetoException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * ClassName: C3P0_
 * Package: com.tge.jdbc.datasource
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/27 - 10:14
 * Version:
 */
public class C3P0_ {


    @Test
    //方式1 ： 相关参数，在程序中指定user，url，password等
    public void testC3P0_01() throws IOException, PropertyVetoException, SQLException {
        //1. 创建一个数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        //2. 通过配置文件mysql.properties获取相关的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        //读取相关属性
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        //连接管理由comboPooledDataSource 来管理
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);

        //设置初始化连接数
        comboPooledDataSource.setInitialPoolSize(10);

        //最大连接数
        comboPooledDataSource.setMaxPoolSize(50);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i ++) {
            Connection connection = comboPooledDataSource.getConnection();
            //System.out.println("连接ok");
            connection.close();
        }
        long end = System.currentTimeMillis();

        System.out.println("连接共耗时：" + (end - start));
    }

    @Test
    //方式二 ： 使用配置文件模板来完成
    public void testC3P0_02() throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("hello");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i ++) {
            Connection connection = comboPooledDataSource.getConnection();
            //System.out.println("连接ok");
            connection.close();
        }
        long end = System.currentTimeMillis();

        System.out.println("连接共耗时：" + (end - start));
    }
}
