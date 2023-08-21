package com.tge.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: FileCopy
 * Package: com.tge.outputstream
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/15 - 22:52
 * Version:
 */
public class FileCopy {
    public static void main(String[] args) {
        FileInputStream fileInputStream =null;
        FileOutputStream fileOutputStream = null;

        String srcFile = "e:\\fileTest\\a.txt";
        String dstFile = "e:\\fileTest1\\a.txt";
        int readLen = 0;
        byte[] buf = new byte[8];
        try {
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(dstFile);
            while ((readLen = fileInputStream.read(buf)) != -1){
                fileOutputStream.write(buf,0,readLen);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileOutputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
