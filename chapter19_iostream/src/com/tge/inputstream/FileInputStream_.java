package com.tge.inputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: FileInputStream
 * Package: com.tge.inputstream
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/15 - 22:03
 * Version:
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01(){
        String filePath = "e:\\fileTest\\hello.txt";
        FileInputStream fileInputStream = null;
        int readData = 0;
        try {
            fileInputStream = new FileInputStream(filePath);
            // 如果返回-1，表示读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
        //  关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void readFile02(){
        String filePath = "e:\\fileTest\\hello.txt";
        FileInputStream fileInputStream = null;
        int readLen = 0;
        // 一次读8个字节
        byte[] buf = new byte[8];
        try {
            fileInputStream = new FileInputStream(filePath);
            /*如果读取正常，read(buf)返回的结果为实际读取的字节数，即在
               在本次案例中，数组为8，如果读到最后没有8个字符，剩几个就返回几*/
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf,0,readLen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //  关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
