package com.tge.enum_;

import java.io.PushbackInputStream;

/**
 * ClassName: Enumration01
 * Package: com.tge.enum_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/5 - 22:21
 * Version:
 */
public class Enumeration01 {
    public static void main(String[] args) {
        // Season spring = new Season("春天", "温暖");
        // Season winter = new Season("冬天", "寒冷");
        // Season summer = new Season("夏天", "炎热");
        // Season autumn = new Season("秋天", "凉爽");
        // 因为对于季节而言，对象是固定的，不会有更多
        // 按这个设计，不能体现季节是固定的四个对象
        // Season other = new Season("红天", "~~~~~");

        System.out.println(Season.SPRING.getName());
        System.out.println(Season.AUTUMN);
    }
}

class Season {
    private String name;
    private String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }


    public String getDesc() {
        return desc;
    }


    public final static Season SPRING = new Season("春天", "温暖");
    public final static Season WINTER = new Season("冬天", "寒冷");
    public final static Season SUMMER = new Season("夏天", "炎热");
    public final static Season AUTUMN = new Season("秋天", "凉爽");
}
