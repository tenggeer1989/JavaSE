package com.tge.studentsystemlogin;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> stu = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("-----------------欢迎来到辽宁大学学生管理系统-----------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的操作编号：");
            int number = sc.nextInt();
            switch (number) {
                case 1 -> addInfo(stu);
                case 2 -> delInfo(stu);
                case 3 -> setInfo(stu);
                case 4 -> getInfo(stu);
                case 5 -> {
                    quit();
                    //break loop;
                    System.exit(0);//停止虚拟机运行
                }
                default -> System.out.println("没有该选项");
            }
        }

    }

    //添加方法
    public static void addInfo(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        String id;
        while (true) {
            System.out.println("请输入学生id：");
            id = sc.next();
            if (idOnly(list, id)) {
                System.out.println("id已存在，请重新输入学生id");
            } else {
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生住址：");
        String address = sc.next();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setAddress(address);

        list.add(stu);

        System.out.println("学生信息添加成功");

    }


    //删除
    public static void delInfo(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的id：");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("id为：" + id + "的学生删除成功");
        } else {
            System.out.println("id不存在");
        }

    }

    //修改
    public static void setInfo(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的id：");
        String id = sc.next();

        int index = getIndex(list, id);
        if (index ==-1) {
            System.out.println("id为：" + id + "不存在，请重新输入");
        }

        //获取学生对象
        Student stu = list.get(index);

        //输入其他的信息并修改
        System.out.println("请输入要修改的学生姓名：");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入要修改的学生年龄：");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入要修改的学生住址：");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

    }

    //查询
    public static void getInfo(ArrayList<Student> list) {

        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("id" + '\t' + "姓名" + '\t' + '\t' + "年龄" + '\t' + "家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + '\t' + stu.getName() + '\t' + '\t' + stu.getAge() + '\t' + stu.getAddress());
        }
    }


    //退出
    public static void quit() {
        System.out.println("感谢使用！！！");
    }

    //判断id是否唯一
    public static boolean idOnly(ArrayList<Student> list, String id) {
        /*for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return true;
            }
        }*/
        return getIndex(list, id) >= 0;//直接调用获取索引的方法，若大于0，表示有相同，输出true
    }

    //通过id获取索引
    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
