package com.tge.jdbc.myjdbc;

import javax.sql.rowset.JdbcRowSet;

/**
 * ClassName: MysqlJdbcImpl
 * Package: com.tge.jdbc.myjdbc
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/25 - 21:58
 * Version:
 */
public class MysqlJdbcImpl implements JbdcInterface {

    @Override
    public Object getConnection() {
        System.out.println("得到mysql的连接");
        return null;
    }

    @Override
    public void curd() {
        System.out.println("完成mysql的增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql的连接");
    }
}
