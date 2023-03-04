package com.tge.test1;

import java.util.Random;

public class Role {
    private String name;
    private double initBlood;

    public Role() {

    }

    public Role(String name, double initBlood) {
        this.name = name;
        this.initBlood = initBlood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInitBlood() {
        return initBlood;
    }

    public void setInitBlood(double initBlood) {
        this.initBlood = initBlood;
    }


    //定义一个方法攻击别人
    //思考：谁攻击谁
    //Role r1 = new Role();
    //Role r2 = new Role();
    //r1.攻击(r2)；
    //方法的调用者去攻击

    public void attack(Role role) {
        //计算造成的伤害1~20
        Random r = new Random();
        int damege = r.nextInt(20) + 1;

        //修改一下挨揍的人的血量
        double remainBlood = role.getInitBlood() - damege;

        //对剩余血量做一个验证，如果为负数，就修改为0
        remainBlood = remainBlood <0 ? 0 : remainBlood;
        //修改一下挨揍的人的血量
        role.setInitBlood(remainBlood);

        //this表示方法的调用者
        System.out.println(this.getName() + "打" + role.getName() + "一下,造成" + damege + "点伤害，"
                + role.getName() + "剩下"+remainBlood+"点血量");
    }


}
