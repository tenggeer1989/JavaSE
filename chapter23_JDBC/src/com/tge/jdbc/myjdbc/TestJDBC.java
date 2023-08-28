package com.tge.jdbc.myjdbc;

/**
 * ClassName: TestJDBC
 * Package: com.tge.jdbc.myjdbc
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/25 - 21:59
 * Version:
 */
public class TestJDBC {
    public static void main(String[] args) {
        JbdcInterface jbdcInterface = new MysqlJdbcImpl();

        jbdcInterface.getConnection();
        jbdcInterface.curd();
        jbdcInterface.close();


    }
}
