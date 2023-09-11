package com.tge.view;

import com.tge.domain.DiningTable;
import com.tge.domain.Employee;
import com.tge.domain.Menu;
import com.tge.service.DiningTableService;
import com.tge.service.EmployeeService;
import com.tge.service.MenuService;
import com.tge.utils.Utility;

import java.util.List;

/**
 * ClassName: MHLView
 * Package: com.tge.view
 * Description:
 *
 * @Author: tge
 * @Create: 2023/9/10 - 22:08
 * Version:
 */
public class MHLView {


    public static void main(String[] args) {
        new MHLView().mainMenu();
    }

    //控制是否退出菜单
    private boolean loop = true;
    private String key = ""; //接收用户的选择
    // 定义一个EmployeeService属性
    private EmployeeService employeeService = new EmployeeService();
    // 定义一个DiningTableService属性
    private DiningTableService diningTableService = new DiningTableService();
    // 定义一个MenuService属性
    private MenuService menuService = new MenuService();


    // 显示所有餐桌状态
    public void listDiningTable(){
        List<DiningTable> list = diningTableService.list();
        System.out.println("\n餐桌编号\t\t餐桌状态");
        for (DiningTable diningTable : list) {
            System.out.println(diningTable);
        }
        System.out.println("==============显示完毕===============");
    }

    // 完成订餐
    public void orderDiningTable(){
        System.out.println("==============预定餐桌====================");
        System.out.println("请选择要预定餐桌编号：");
        int orderId = Utility.readInt();
        if(orderId == -1) {
            System.out.println("==============取消预定餐桌====================");
            return;
        }
        char key = Utility.readConfirmSelection();
        if(key ==  'Y'){
            DiningTable diningTableById = diningTableService.getDiningTableById(orderId);
            if (diningTableById == null){
                System.out.println("====================您预定的餐桌不存在=====================");
                return;
            }
            // 判断餐桌状态是否为空
            if(!("空".equals(diningTableById.getState()))){
                System.out.println("====================当前餐桌已预定====================");
                return;
            }
            System.out.println("预定人的名字：");
            String orderName = Utility.readString(50);
            System.out.println("预订人电话：");
            String orderTel = Utility.readString(50);
            if(diningTableService.orderDiningTable(orderId,orderName,orderTel)){
                System.out.println("=================预定成功=======================");
            }else {
                System.out.println("=================预定失败=======================");
            }
        }else {
            System.out.println("==============取消预定餐桌====================");
        }


    }

    // 显示所有菜品
    public void listMenu(){
        List<Menu> menuList = menuService.getMenuList();
        System.out.println("\n编号\t\t菜名\t\t价格");
        for (Menu menu : menuList) {
            System.out.println(menu);
        }
    }

    // 显示主菜单
    public void mainMenu(){

        while (loop) {
            System.out.println("\n===============满汉楼================");
            System.out.println("\t\t 1 登录满汉楼");
            System.out.println("\t\t 2 退出满汉楼");
            System.out.print("请输入你的选择: ");
            key = Utility.readString(1);
            switch (key) {
                case "1" :
                    System.out.print("输入员工号: ");
                    String empId = Utility.readString(50);
                    System.out.print("输入密码: ");
                    String pwd = Utility.readString(50);
                    Employee employee = employeeService.getEmployeeIdAndPwd(empId, pwd);
                    if (employee != null) { //说明存在该用户
                        System.out.println("===============登录成功["+ employee.getName() +"]================\n");
                        //显示二级菜单, 这里二级菜单是循环操作，所以做成while
                        while (loop) {
                            System.out.println("\n===============满汉楼(二级菜单)================");
                            System.out.println("\t\t 1 显示餐桌状态");
                            System.out.println("\t\t 2 预定餐桌");
                            System.out.println("\t\t 3 显示所有菜品");
                            System.out.println("\t\t 4 点餐服务");
                            System.out.println("\t\t 5 查看账单");
                            System.out.println("\t\t 6 结账");
                            System.out.println("\t\t 9 退出满汉楼");
                            System.out.print("请输入你的选择: ");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    listDiningTable();
                                    break;
                                case "2":
                                    orderDiningTable();
                                    break;
                                case "3":
                                    listMenu();
                                    break;
                                case "4":
                                    System.out.println("点餐服务");
                                    //orderMenu();
                                    break;
                                case "5":
                                    System.out.println("查看账单");
                                    //listBill();//显示所有账单
                                    break;
                                case "6":
                                    System.out.println("结账");
                                    //payBill();
                                    break;
                                case "9":
                                    loop = false;
                                    break;
                                default:
                                    System.out.println("你的输入有误，请重新输入");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("===============登录失败================");
                    }
                    break;
                case "2" :
                    loop = false;//
                    break;
                default:
                    System.out.println("你输入有误，请重新输入.");

            }
        }
    }
}
