package com.tge.jdbc.datasource;





import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName: JDBCUtilsByDruid_Use
 * Package: com.tge.jdbc.datasource
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/27 - 13:19
 * Version:
 */
public class JDBCUtilsByDruid_Use {
    public static void main(String[] args) throws SQLException {
        //1. 等到连接
        Connection connection = null;


        //2.sql
        String sql = "select * from actor where id = ?";
        PreparedStatement preparedStatement = null;
        ResultSet set = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,4);
            set = preparedStatement.executeQuery();
            while (set.next()){
                int id = set.getInt("id");
                String name = set.getString("name");
                String sex = set.getString("sex");
                String borndate = set.getString("borndate");
                String phone = set.getString("phone");
                System.out.println(id + "\t" + name + "\t" + sex + "\t" + borndate + "\t" + phone);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,preparedStatement,connection);
        }
    }
}
