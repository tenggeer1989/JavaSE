package com.tge.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

/**
 * ClassName: FileWriter_
 * Package: com.tge.writer
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/15 - 23:30
 * Version:
 */
public class FileWriter_ {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        String filePath = "e:\\fileTest\\a.txt";
        char[] chars = {'a','b','c'};
        try {
            fileWriter = new FileWriter(filePath);
            // 1.第一种方式
            fileWriter.write('a');
            // 2.写入指定数组
            fileWriter.write(chars);
            // 3.写入指定数组的指定部分
            fileWriter.write("hello,java".toCharArray(),0,3);
            // 4. 写入整个字符串
            fileWriter.write("你好北京");
            // 5.写入指定字符串的指定部分
            fileWriter.write("我爱我家",2,2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            // 对应FileWriter必须要关闭流，要不然无法写到文件中
            try {
                fileWriter.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
