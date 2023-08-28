package com.tge.jdbc.transaction;

import com.tge.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ClassName: Transaction_
 * Package: com.tge.jdbc.transaction
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/26 - 23:56
 * Version:
 */
public class Transaction_ {

    @Test
    public void noTransaction(){
        //1. 等到连接
        Connection connection = null;


        //2.sql
        String sql = "update account set balance = balance - 100 where id = 1";
        String sql2 = "update account set balance = balance + 100 where id = 2";
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();//执行第一条

            int i = 1 / 0;//抛出异常
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();//执行第二条
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(null,preparedStatement,connection);
        }
    }

    @Test
    public void useTransaction(){
        //1. 等到连接
        Connection connection = null;


        //2.sql
        String sql = "update account set balance = balance - 100 where id = 1";
        String sql2 = "update account set balance = balance + 100 where id = 2";
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            //将connection设置为不自动提交
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();//执行第一条

            //int i = 1 / 0;//抛出异常
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();//执行第二条

            //提交事务
            connection.commit();
        } catch (SQLException e) {
            //这里我们可以进行回滚，撤销执行的SQL
            // 默认回滚到事务开始的状态
            System.out.println("执行发生了异常");
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(null,preparedStatement,connection);
        }
    }
}
