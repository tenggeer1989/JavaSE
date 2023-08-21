package com.tge.enum_;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

/**
 * ClassName: EnumExercise
 * Package: com.tge.enum_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/5 - 23:29
 * Version:
 */
public class EnumExercise {
    public static void main(String[] args) {
        Gender2 boy = Gender2.BOY;
        Gender2 boy2 = Gender2.BOY;
        System.out.println(boy);
        System.out.println(boy == boy2);
    }
}

enum Gender2{
    BOY,GIRL;
}
