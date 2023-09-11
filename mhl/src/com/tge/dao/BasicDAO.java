package com.tge.dao;

import com.tge.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * ClassName: BasicDAO
 * Package: com.tge.dao_.dao
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/28 - 17:12
 * Version:
 */
public class BasicDAO<T> {


    private QueryRunner queryRunner = new QueryRunner();

    //开发同意的dml方法，针对任意的表
    public int update(String sql,Object... parameters) throws SQLException {
        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            int update = queryRunner.update(connection,sql, parameters);
            return update;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

    //返回多个对象（即查询的结果是多行）
    public List<T> queryMulti(String sql, Class<T> clazz, Object... parameters) throws SQLException {
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            return queryRunner.query(connection,sql, new BeanListHandler<T>(clazz),parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

    //查询单行结果方法的通用方法
    public T querySingle(String sql, Class<T> clazz, Object... parameters) throws SQLException {
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            return queryRunner.query(connection,sql, new BeanHandler<T>(clazz),parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

    // 查询单行单列的方法，即返回单值的方法
    public Object queryScalar(String sql,Object... parameters) throws SQLException {
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            return queryRunner.query(connection,sql, new ScalarHandler(),parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }
}

