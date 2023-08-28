package com.tge.jdbc.myjdbc;

/**
 * ClassName: JbdcInterface
 * Package: com.tge.jdbc.myjdbc
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/25 - 21:55
 * Version:
 */
public interface JbdcInterface {

    public Object getConnection();

    public void curd();

    public void close();
}
