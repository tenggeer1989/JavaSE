package com.tge.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {

    private StudentUtil(){}

    //静态方法
    public static int getMaxAgeStudent(ArrayList<Student> list){
        //1.定义一个参照物
        int max = list.get(0).getAge();

        //2.循环遍历
        for (int i = 1; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();//尽量反复调用方法
            if(max < tempAge){
                max = list.get(i).getAge();
            }
        }
        return max;
    }
}
