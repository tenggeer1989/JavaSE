package com.tge.test1;

public class GirlFriendTest1 {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();

        System.out.println(gf1.getName());
        gf1.setName('石') ;
        gf1.height = 1.66;
        gf1.weight = 120;

        System.out.println(gf1.getName());
        System.out.println(gf1.height);
        System.out.println(gf1.weight);

        gf1.eat();
        gf1.justEat();

        //如果创建第二个
        GirlFriend gf2 = new GirlFriend();
        gf2.setName('c');
        gf2.height = 1.66;
        gf2.weight = 120;

        System.out.println(gf2.getName());
        System.out.println(gf2.height);
        System.out.println(gf2.weight);

        gf2.eat();
        gf2.justEat();
    }
}
