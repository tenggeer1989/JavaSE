package com.tge.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ClassName: FileReader_
 * Package: com.tge.reader
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/15 - 23:18
 * Version:
 */
public class FileReader_ {
    public static void main(String[] args) {

        String filePath = "e:\\fileTest\\a.txt";
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(filePath);
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

