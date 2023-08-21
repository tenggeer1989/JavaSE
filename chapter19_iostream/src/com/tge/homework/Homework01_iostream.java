package com.tge.homework;

import java.io.*;

/**
 * ClassName: Homework01_iostream
 * Package: com.tge.homework
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/16 - 23:24
 * Version:
 */
public class Homework01_iostream {
    public static void main(String[] args) throws IOException {
        String str = "e:\\mytemp";
        String str1 = "e:\\mytemp\\hello.txt";
        File file = new File(str);
        File file1 = new File(str1);
        BufferedWriter bis = null;

        if (!(file.exists())){
            file.mkdir();
            System.out.println("目录创建成功");
        }else {
            System.out.println("目录已存在");
        }

        if (!(file1.exists())){
            file1.createNewFile();
            System.out.println("文件创建成功");
            String str2 = "hello,Java!!!";
            bis = new BufferedWriter(new FileWriter(file1));
            bis.write(str2);
            bis.close();


        }else {
            System.out.println("文件已存在");
        }
    }
}
