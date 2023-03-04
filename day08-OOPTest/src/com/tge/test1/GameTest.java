package com.tge.test1;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰",100);




        Role r2 = new Role("鸠摩智",100);



        System.out.println("第一个人物：");
        System.out.println("姓名：乔峰 血量：100 伤害：15");
        System.out.println("第二个人物：");
        System.out.println("姓名：鸠摩智 血量：100 伤害：12");
        System.out.println("开始打架");

        while (true) {
            //r1开始攻击r2
            r1.attack(r2);
            //判断r2的剩余血量
            if (r2.getInitBlood() == 0) {
                System.out.println(r1.getName()+"获胜");
                break;
            }

            r2.attack(r1);
            if (r1.getInitBlood() == 0) {
                System.out.println(r2.getName()+"获胜");
                break;
            }

        }

    }
}
