package com.tge.enum_;

/**
 * ClassName: EnumExercise02
 * Package: com.tge.enum_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/5 - 23:47
 * Version:
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        Day[] values = Day.values();
        System.out.println("===所有星期的信息如下===");
        for (Day i : values){
            System.out.println(i);
        }
    }
}

enum Day {
    MONSDAY("星期一"),TUESDAY("星期二"),WEDNSDAY("星期三"),
    THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");

    private String name;

    private Day(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
