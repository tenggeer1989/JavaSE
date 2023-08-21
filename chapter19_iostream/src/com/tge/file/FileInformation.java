package com.tge.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * ClassName: FileInformation
 * Package: com.tge.file
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/15 - 10:38
 * Version:
 */
public class FileInformation {
    public static void main(String[] args) {

    }

    @Test
    public void info() {
        File file = new File("e:\\fileTest\\news1.txt");


        System.out.println("文件名字：" + file.getName());
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
        System.out.println("文件父级目录：" + file.getParent());
        System.out.println("文件大小：" + file.length());
        System.out.println("文件是否存在：" + file.exists());
        System.out.println("是不是目录：" + file.isDirectory());
        System.out.println("是不是文件：" + file.isFile());


    }
}
