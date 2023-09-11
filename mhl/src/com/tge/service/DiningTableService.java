package com.tge.service;

import com.tge.dao.DiningTableDAO;
import com.tge.domain.DiningTable;

import java.sql.SQLException;
import java.util.List;

/**
 * ClassName: DiningTableService
 * Package: com.tge.service
 * Description:
 *
 * @Author: tge
 * @Create: 2023/9/10 - 23:16
 * Version:
 */
public class DiningTableService {
    //定义一个DiningTableDAO对象
    private DiningTableDAO diningTableDAO = new DiningTableDAO();

    // 返回所有餐桌的集合
    public List<DiningTable> list(){
        try {
            return diningTableDAO.queryMulti("select id,state from diningTable", DiningTable.class);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 订座
    
}
