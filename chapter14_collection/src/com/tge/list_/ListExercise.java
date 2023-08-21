package com.tge.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: ListExercise
 * Package: com.tge.list_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/9 - 23:02
 * Version:
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        list.add("hello4");
        list.add("hello5");
        list.add("hello6");
        list.add("hello7");
        list.add("hello8");
        list.add("hello9");
        list.add("hello10");
        list.add("hello11");
        list.add("hello12");

        list.add(1,"韩顺平教育");
        Object o = list.get(4);
        System.out.println(o);
        list.remove(5);
        list.set(6,123);


        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.print(obj + "\t");
        }
    }
}
