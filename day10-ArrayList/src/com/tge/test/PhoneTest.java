package com.tge.test;

import java.util.ArrayList;

public class PhoneTest {

    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("xiaomi",1000);
        Phone p2 = new Phone("iphone",8000);
        Phone p3 = new Phone("hammer",2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> phoneInfoList =  getPhoneInfo(list);

        for (int i = 0; i < phoneInfoList.size(); i++) {
            System.out.println(phoneInfoList.get(i).getBrand() +","+phoneInfoList.get(i).getPrice());
        }

    }
    //如果要返回多个数据，可以把这些数据先放到容器当中，再把容器返回
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice()<3000){
                resultList.add(list.get(i));
            }
        }
        return resultList;
    }
}
