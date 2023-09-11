package com.tge.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * ClassName: JDBCUtilsByDruid
 * Package: com.tge.jdbc.datasource
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/27 - 13:12
 * Version:
 */
public class JDBCUtilsByDruid {

    private static DataSource ds;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("mhl\\src\\druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    //
    public  static void  close(ResultSet resultSet, Statement statement, Connection connection) throws SQLException {
           if(resultSet != null){
               resultSet.close();
           }
           if (statement != null){
               statement.close();
           }
           if (connection != null){
               connection.close();
           }
    }
}
