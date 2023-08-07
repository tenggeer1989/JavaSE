package com.tge.homework;

/**
 * ClassName: Homework04
 * Package: com.tge.homework
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/6 - 10:30
 * Version:
 */
public class Homework04 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new ICalculate() {
            @Override
            public int work(int n1, int n2) {
                return n1 + n2;
            }
        },10,20);
    }
}

class CellPhone {
    public void testWork(ICalculate iCalculate,int n1,int n2){

        int result = iCalculate.work(n1,n2);
        System.out.println(result);
    }



}

interface ICalculate{
    public int work(int n1,int n2);
}