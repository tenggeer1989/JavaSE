package com.tge.reflection.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName: Homework01
 * Package: com.tge.reflection.homework
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/21 - 22:46
 * Version:
 */
public class Homework01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {

        Class<PrivateTest> privateTestClass = PrivateTest.class;
        PrivateTest privateTest = privateTestClass.newInstance();
        Field name = privateTestClass.getDeclaredField("name");

        name.setAccessible(true);
        name.set(privateTest,"hellotom");

        //得到getName方法对象
        Method method = privateTestClass.getMethod("getName");
        Object invoke = method.invoke(privateTest);
        System.out.println(invoke);

    }


}

class PrivateTest{
    private String name = "hellokitty";

    public String getName(){
        return name;
    }
}
