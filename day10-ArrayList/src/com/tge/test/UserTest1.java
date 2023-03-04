package com.tge.test;

import java.util.ArrayList;
import java.util.Scanner;

public class UserTest1 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("1","zhangsan","zhangsan123");
        User u2 = new User("2","lisi","lisi456");
        User u3 = new User("3","wangwu","wangwu789");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        Scanner sc = new Scanner(System.in);
        System.out.println("please input username:");
        String name = sc.next();

        Boolean result = search(list, name);
        System.out.println(result);

    }

    public static boolean search(ArrayList<User> list,String name){

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getUsername().equals(name)){
                return true;
            }
        }
        return false;
    }
}
