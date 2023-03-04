package com.tge.test9;

public class StudenTest {
    public static void main(String[] args) {

        //1.创建一个数组，存储学生对象
        Student[] arr = new Student[3];

        //2.创建学生对象并添加到数组当中
        Student stu1 = new Student(1, "zhangsan", 18);
        Student stu2 = new Student(2, "lisi", 19);
        Student stu3 = new Student(3, "wangwu", 20);


        //3.把学生对象放到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //要求5：查询数组id为2的学生，如果存在则将他的年龄+1岁

        //要找到id在数组中对应的索引
        int index = getIndex(arr, 4);
        if (index >= 0) {
            int age = arr[index].getAge();
            arr[index].setAge(age + 1);
            printArr(arr);
        } else {
            System.out.println("无此学生");
        }

    }

    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getId() + "," + arr[i].getName() + "," + arr[i].getAge());
            }
        }
    }
}

