package com.tge.service;

import com.tge.dao.EmployeeDAO;
import com.tge.domain.Employee;

import java.sql.SQLException;

/**
 * ClassName: EmployeeService
 * Package: com.tge.service
 * Description:
 *
 * @Author: tge
 * @Create: 2023/9/10 - 22:40
 * Version:
 */
public class EmployeeService {

    private EmployeeDAO employeeDAO = new EmployeeDAO();

    public Employee getEmployeeIdAndPwd(String empId,String pwd){

        try {
            Employee employee =
                    employeeDAO.querySingle("select * from employee where empId =? and pwd=md5(?)", Employee.class, empId, pwd);
            return employee;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
