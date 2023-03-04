package com.tge.test2;

public class GirlFriendTest1 {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();

        gf1.setName("shiyuan");
        gf1.setHeight(166);
        gf1.setWeight(105);

        System.out.println(gf1.getName());
        System.out.println(gf1.getHeight());
        System.out.println(gf1.getWeight());

        gf1.eat();
        gf1.justEat();
    }
}
