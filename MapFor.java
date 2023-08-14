package com.tge.map_;

import java.util.*;

/**
 * ClassName: MapFor
 * Package: com.tge.map_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/11 - 10:32
 * Version:
 */
public class MapFor {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        hashMap.put("Alice", "信息1");
        hashMap.put("Bob", "信息2");
        hashMap.put("Charlie", "信息3");
        hashMap.put("David", "信息4");
        hashMap.put("Eva", "信息5");
        hashMap.put("Frank", "信息6");

        // 第一组：先取出 所有的key，通过key找对应的value
        Set keyset = hashMap.keySet();
        // 1. 增强for
        System.out.println("----第一种方式-------");
        for (Object key : keyset) {
            System.out.println(key + "-" + hashMap.get(key));
        }
        // 2. 迭代器
        System.out.println("----第二种方式-------");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + "-" + hashMap.get(key));
        }

        // 第二组： 把所有的values取出
        Collection values = hashMap.values();
        // 可以使用所有的collections使用的遍历方法
        // 1.增强for
        System.out.println("----第三种方式-------");
        for(Object value : values){
            System.out.println(value);
        }

        // 2. 迭代器
        System.out.println("----第四种方式-------");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value =  iterator1.next();
            System.out.println(value);
        }

        // 第三组： 通过EntrySet 来取k-v
        Set entrySet = hashMap.entrySet();
        // 1.增强for
        System.out.println("----第五种方式-------");
        for (Object entry : entrySet) {
            // 将entry 转成 map.entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        // 2. 迭代器
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry =  iterator2.next();
            Map.Entry m  = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());

        }

    }
}
