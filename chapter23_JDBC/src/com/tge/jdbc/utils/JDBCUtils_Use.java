package com.tge.jdbc.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ClassName: JDBCUtils_Use
 * Package: com.tge.jdbc.utils
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/26 - 10:35
 * Version:
 */
public class JDBCUtils_Use {

    public static void main(String[] args) {
        new JDBCUtils_Use().testDML();
    }

    public void testDML(){

        //1. 等到连接
        Connection connection = null;


        //2.sql
        String sql = "update actor set name = ? where id = ?";
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"周星驰");
            preparedStatement.setInt(2,4);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(null,preparedStatement,connection);
        }


    }
}
