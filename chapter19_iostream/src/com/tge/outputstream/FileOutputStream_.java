package com.tge.outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: writeFile
 * Package: com.tge.outputstream
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/15 - 22:41
 * Version:
 */
public class FileOutputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile(){
        String filePath = "e:\\fileTest\\a.txt";
        FileOutputStream fileOutputStream = null;

        try {
            // 1. new FileOutputStream(filePath)创建方式，写入内容是覆盖原文件
            // 2. new FileOutputStream(filePath,true)创建方式，写入内容是追加
            fileOutputStream = new FileOutputStream(filePath,true);
            // 1.输入一个字符
            // fileOutputStream.write('h');
            // 2.写入字符串
            String str = "java";
            // fileOutputStream.write(str.getBytes());
            // 3.可以选择加入多少长度
            fileOutputStream.write(str.getBytes(),0,3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
