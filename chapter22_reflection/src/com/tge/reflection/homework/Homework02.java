package com.tge.reflection.homework;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName: Homework02
 * Package: com.tge.reflection.homework
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/21 - 23:14
 * Version:
 */
public class Homework02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException {
        Class<?> fileClazz = Class.forName("java.io.File");



        Constructor<?>[] declaredConstructors = fileClazz.getDeclaredConstructors();

        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        Constructor<?> declaredConstructor = fileClazz.getDeclaredConstructor(String.class);
        String filePath = "e:\\test123.txt";
        // File o = (File)declaredConstructor.newInstance(filePath);
        // o.createNewFile();
        Object o = declaredConstructor.newInstance(filePath);
        Method method = fileClazz.getMethod("createNewFile");
        method.invoke(o);
    }
}
