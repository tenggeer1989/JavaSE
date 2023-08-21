package com.tge.houserent;

/**
 * ClassName: HouseService
 * Package: com.tge.houserent
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/2 - 21:12
 * Version:
 */
public class HouseService {

    private House[] houses;
    int houseNum = 0;

    public HouseService(int size) {
        houses = new House[size];
        // 做个测试，先加一条数据
        // houses[0] = new House(1,"tom","111","赛罕区",3000,"未出租");

    }

    public House[] printInfo() {
        return houses;
    }

    public boolean add(String name, String tel, String addr, int rent, String status) {
        if (houseNum >= houses.length) {
            System.out.println("数组已满，不能添加");
            return false;
        }
        houses[houseNum] = new House(houseNum + 1, name, tel, addr, rent, status);
        houseNum++;

        return true;
    }

    public boolean del(int delNum) {
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (delNum == houses[i].getId()) {
                index = i;
            }
        }

        if (index == -1) {
            return false;
        }

        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i + 1];
        }
        // 将最后一个有数据的信息置为null(重复数据)
        houses[houseNum - 1] = null;
        return true;
    }

    public void houseInfo(int searchNum){
        int index = -1;

        for (int i = 0; i < houses.length; i++) {
            if (searchNum == houses[i].getId()){
                index = i;
                System.out.println(houses[index].getId() + "\t" + houses[index].getHost() + "\t" + houses[i].getTel() + "\t" + houses[i].getAddr() + "\t" + houses[i].getRent());
                break;
            }
        }

        if (index == -1){
            System.out.println("您所输入的编号有误");
        }

    }

    public void update(int num, String name, String tel, String addr, int rent, String status){
        houses[num - 1].setHost(name);
        houses[num - 1].setTel(tel);
        houses[num - 1].setAddr(addr);
        houses[num - 1].setRent(rent);
        houses[num - 1].setStatus(status);
    }
}
