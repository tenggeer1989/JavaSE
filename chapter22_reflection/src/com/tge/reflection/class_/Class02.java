package com.tge.reflection.class_;

import com.tge.Car;
import com.tge.Cat;

import java.lang.reflect.Field;

/**
 * ClassName: Class02
 * Package: com.tge.reflection.class_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/21 - 20:16
 * Version:
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classAllPath = "com.tge.Car";
        Class<?> cls = Class.forName(classAllPath);

        System.out.println(cls);//显示cls对象，是哪个类的Class对象
        System.out.println(cls.getClass());//输出cls运行类型  java.lang.Class
        // 得到包名
        System.out.println(cls.getPackage().getName());

        //得到全类名
        System.out.println(cls.getName());

        //通过cls创建对象实例
        Car car = (Car)cls.newInstance();
        System.out.println(car);

        //通过反射获取属性
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));

        //通过反射给属性赋值
        brand.set(car,"奔驰");
        System.out.println(brand.get(car));

        //得到所有属性
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }


    }
}
