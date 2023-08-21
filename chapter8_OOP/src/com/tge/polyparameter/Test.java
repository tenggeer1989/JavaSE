package com.tge.polyparameter;

/**
 * ClassName: Test
 * Package: com.tge.polyparameter
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/30 - 20:49
 * Version:
 */
public class Test {
    public static void main(String[] args) {
        Manager david = new Manager("david",5000,3000);
        Worker tom = new Worker("tom",4000);

        double mngSal = showEmpAnnual(david);
        double workSal = showEmpAnnual(tom);

        System.out.println("经理的工资为："  + mngSal);
        System.out.println("员工的工资为：" + workSal);

        testWork(tom);
        testWork(david);



    }

    public static double showEmpAnnual(Employee e){
        return e.getAnnual();
    }

    public static void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        } else if (e instanceof Manager){
            ((Manager) e).manage();
        } else {
            System.out.println("不做处理");
        }
    }
}
