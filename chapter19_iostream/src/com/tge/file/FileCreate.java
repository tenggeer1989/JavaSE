package com.tge.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: FileCreate
 * Package: com.tge.file
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/15 - 10:27
 * Version:
 */
public class FileCreate {
    public static void main(String[] args) {

    }

    @Test
    public void create01(){
        String filePath = "e:\\fileTest\\news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void create2(){

        File parentFile = new File("e:\\fileTest\\");
        String filePath = "news2.txt";
        File file = new File(parentFile,filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    @Test
    public void create3(){
        String parentPath = "e:\\fileTest";
        String filePath = "news3.txt";
        File file = new File(parentPath, filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


