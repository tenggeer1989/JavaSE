package com.tge.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ClassName: Homework02_iostream
 * Package: com.tge.homework
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/16 - 23:49
 * Version:
 */
public class Homework02_iostream {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\mytemp\\hello.txt";

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String len = "";
        int i = 0;
        while ((len = br.readLine()) != null){
            System.out.println((++i) + " " + len);
        }

        if (br != null) {
            br.close();
        }

    }
}
