package com.tge.jdbc.datasource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * ClassName: DBUtils_USE
 * Package: com.tge.jdbc.datasource
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/27 - 22:42
 * Version:
 */
public class DBUtils_USE {
    @Test
    public void testQueryMany() throws SQLException {

        // 1. 得到连接
        Connection connection = JDBCUtilsByDruid.getConnection();

        // 2. 使用DBUtils类和接口，引入jar包  commons-dbutils-1.3.jar

        // 3. 创建 QueryRunner
        QueryRunner queryRunner = new QueryRunner();

        // 4.执行相关方法，返回ArrayList结果
        //String sql = "select * from actor where id >= ?";
        String sql = "select id,name from actor where id >= ?";


        // query方法就是执行sql语句，得到resultset 并封装到ArrayList集合中
        List<Actor> list = queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);

        System.out.println("输出集合的信息：");
        for (Actor actor : list) {
            System.out.println(actor);
        }

        // 释放资源
        JDBCUtilsByDruid.close(null,null,connection);
    }

    //演示 apache-dbutils + druid 完成 返回的结果是单行记录(单个对象)
    @Test
    public void testQuerySingle() throws SQLException {

        // 1. 得到 连接 (druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        // 2. 使用DBUtils类和接口，引入jar包  commons-dbutils-1.3.jar
        // 3. 创建 QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        // 4. 就可以执行相关的方法，返回单个对象
        String sql = "select * from actor where id = ?";
        // 返回单行记录<--->单个对象 , 使用Hander 是 BeanHandler
        Actor actor = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), 3);
        System.out.println(actor);

        // 释放资源
        JDBCUtilsByDruid.close(null, null, connection);

    }

    //演示apache-dbutils + druid 完成查询结果是单行单列-返回的就是object
    @Test
    public void testScalar() throws SQLException {

        // 1. 得到 连接 (druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        // 2. 使用DBUtils类和接口，引入jar包  commons-dbutils-1.3.jar
        // 3. 创建 QueryRunner
        QueryRunner queryRunner = new QueryRunner();

        //4. 就可以执行相关的方法，返回单行单列 , 返回的就是Object
        String sql = "select name from actor where id = ?";
        //因为返回的是一个对象, 使用的handler 就是 ScalarHandler
        Object obj = queryRunner.query(connection, sql, new ScalarHandler(), 4);
        System.out.println(obj);

        // 释放资源
        JDBCUtilsByDruid.close(null, null, connection);
    }

    //演示apache-dbutils + druid 完成 dml (update, insert ,delete)
    @Test
    public void testDML() throws SQLException {

        //1. 得到 连接 (druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2. 使用 DBUtils 类和接口 , 先引入DBUtils 相关的jar , 加入到本Project
        //3. 创建 QueryRunner
        QueryRunner queryRunner = new QueryRunner();

        //4. 这里组织sql 完成 update, insert delete
        //String sql = "update actor set name = ? where id = ?";
        //String sql = "insert into actor values(null, ?, ?, ?, ?)";
        String sql = "delete from actor where id = ?";

        //(1) 执行dml 操作是 queryRunner.update()
        //(2) 返回的值是受影响的行数 (affected: 受影响)
        //int affectedRow = queryRunner.update(connection, sql, "林青霞", "女", "1966-10-10", "116");
        int affectedRow = queryRunner.update(connection, sql, 4 );
        System.out.println(affectedRow > 0 ? "执行成功" : "执行没有影响到表");

        // 释放资源
        JDBCUtilsByDruid.close(null, null, connection);

    }



}
