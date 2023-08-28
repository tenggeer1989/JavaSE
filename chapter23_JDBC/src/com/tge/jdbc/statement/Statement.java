package com.tge.jdbc.statement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

/**
 * ClassName: Statement
 * Package: com.tge.jdbc.statement
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/26 - 9:28
 * Version:
 */
public class Statement {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

        Scanner sc = new Scanner(System.in);
        // 用户输入的管理员和密码
        System.out.println("请输入用户名：");
        String admin_name = sc.nextLine();
        System.out.println("请输入密码：");
        String admin_password = sc.nextLine();

        Properties properties = new Properties();
        properties.load(new FileInputStream("chapter23_JDBC\\src\\mysql.properties"));
        //获取相关的值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        //1. 注册驱动
        Class.forName(driver);//建议写上

        //2. 得到连接
        Connection connection = DriverManager.getConnection(url, user, password);

        //3. 得到Statement
        java.sql.Statement statement = connection.createStatement();
        //4. 组织SqL
        String sql = "select name, pwd from admin where name = '"+ admin_name +"' and pwd = '"+ admin_password +"'";
        //执行给定的SQL语句，该语句返回单个 ResultSet对象
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) { //如果查询到一条记录，则说明该管理存在
            System.out.println("恭喜， 登录成功");
        } else {
            System.out.println("对不起，登录失败");
        }

        //关闭连接
        resultSet.close();
        statement.close();
        connection.close();

    }
}
