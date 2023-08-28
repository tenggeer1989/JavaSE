package com.tge.jdbc;


import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * ClassName: Jdbc01
 * Package: com.tge.jdbc
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/25 - 22:09
 * Version:
 */
public class Jdbc01 {
    public static void main(String[] args) throws SQLException {
        // 注册驱动
        Driver driver = new Driver();
        // 得到连接
        String url = "jdbc:mysql://localhost:3306/db02";
        // 将用户名密码放到Properties对象
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","qwer1234");

        Connection connect = driver.connect(url, properties);

        // 执行sql
        //String sql = "insert into actor values(null, '刘德华', '男', '1970-11-11', '110')";
        String sql = "delete from actor where id = 2";
        Statement statement = connect.createStatement();
        int i = statement.executeUpdate(sql);// i 1 成功  ， 0   失败

        System.out.println(i > 0 ? "成功" : "失败");
        System.out.println(i);
        // 关闭资源
        statement.close();
        connect.close();
    }
}
