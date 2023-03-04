package com.tge.test2;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰",100,'男');



        Role r2 = new Role("鸠摩智",100,'男');

        //展示一下角色信息
        r1.showRoleInfo();
        r2.showRoleInfo();

        while (true) {
            //r1开始攻击r2
            r1.attack(r2);
            //判断r2的剩余血量
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName()+"获胜");
                break;
            }

            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName()+"获胜");
                break;
            }

        }

    }
}
