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

    // 根据id，查询对应的餐桌DiningTable 对象
    // 如果返回null，标识id编号对应的餐桌不存在
    public DiningTable getDiningTableById(int id) {
        try {
            return diningTableDAO.querySingle("select * from diningTable where id=?", DiningTable.class,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 如果餐桌可以预定，调用方法，对其状态进行更新
    public boolean orderDiningTable(int id,String orderName,String orderTel){

        try {
            int update = diningTableDAO.update("update diningTable set state='ordered', orderName=?,orderTel=? where id=?" , orderName, orderTel,id);

            return update > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
