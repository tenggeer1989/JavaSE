package com.tge.service;

import com.tge.dao.MenuDAO;
import com.tge.domain.Menu;

import java.sql.SQLException;
import java.util.List;

/**
 * ClassName: MenuService
 * Package: com.tge.service
 * Description:
 *
 * @Author: tge
 * @Create: 2023/9/11 - 22:40
 * Version:
 */
public class MenuService {

    // 定义MenuDAO属性
    private MenuDAO menuDAO = new MenuDAO();

    public List<Menu> getMenuList(){
        try {
            return menuDAO.queryMulti("select * from menu", Menu.class);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 根据id，返回menu对象
    public Menu getMenuById(int id){
        try {
            return menuDAO.querySingle("select * from menu where id=?", Menu.class,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
