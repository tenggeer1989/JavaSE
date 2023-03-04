package com.tge.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
    /*
    boolean add(E a)          添加

    boolean remove(E a)       删除
    E remove(int index)

    E set(int index,E e)      修改

    E get(int index)          查询
    int size()                获取长度
     */

    public static void main(String[] args) {

        //1.创建一个集合
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //3.删除元素
        /*boolean result = list.remove("bbb");
        boolean result1 = list.remove("eee");//删除没有的元素会失败

        String str = list.remove(2);//将删除的索引内容赋值给str
        System.out.println(str);//反馈list被删除索引2的内容*/


        //4.修改元素
        /*String result = list.set(1,"ddd");
        System.out.println(result);//输出修改位置原来的数组，bbb*/

        //5.查询元素
        /*String result = list.get(3);
        System.out.println(result);//bbb*/

        //遍历
        for (int i = 0; i < list.size(); i++) {
            //i 索引
            //list.get(i)  元素
            String str = list.get(i);
            System.out.println(str);
        }



        //System.out.println(result1);//false

        System.out.println(list);
    }
}
