package com.tge.service;

import com.tge.dao.BillDAO;
import com.tge.domain.Bill;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

/**
 * ClassName: BillService
 * Package: com.tge.service
 * Description:
 *
 * @Author: tge
 * @Create: 2023/9/11 - 22:52
 * Version:
 */
public class BillService {

    private BillDAO billDAO = new BillDAO();

    //定义menuService的属性
    private MenuService menuService = new MenuService();
    //定义diningTableService的属性
    private DiningTableService diningTableService = new DiningTableService();

    public boolean orderMenu(int menuId, int nums,int diningTableId){
        // 生成一个账单号UUID
        String billId = UUID.randomUUID().toString();
        // 将账单生成到bill表
        try {
            int update = billDAO.update("insert into bill values(null,?,?,?,?,?,now(),'未结账')",
                    billId, menuId, nums, menuService.getMenuById(menuId).getPrice() * nums, diningTableId);

            if(update <= 0){
                return false;
            }

            return diningTableService.updateDiningTableState(diningTableId,"就餐中");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 返回所有的账单，提供给View调用
    public List<Bill> list(){
        try {
            return billDAO.queryMulti("select * from bill", Bill.class);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 查看某个餐桌是否有未结账的账单
    public boolean hasPayBillByDiningTableId(int diningTableId){
        try {
            Bill bill = billDAO.querySingle("select * from bill where diningTableId = ? and state = '未结账' limit 0,1", Bill.class,diningTableId);
            return bill != null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 如果餐桌存在，并且该餐桌有未结账的账单
    public boolean payBill(int diningTableId,String payMode){
        // 1. 修改bill表
        try {
            int update = billDAO.update("update bill set state=? where diningTableId=? and state='未结账'", payMode, diningTableId);
            if(update <= 0){
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // 2. 修改diningTable表
        // 注意：不要在该service里操作，要调用diningTableService操作
        if(!diningTableService.updateDiningTableToFree(diningTableId,"空")){
            return false;
        }
        return true;
    }

}
