package com.tge.file;

import org.junit.jupiter.api.Test;

import java.awt.datatransfer.DataFlavor;
import java.io.File;

/**
 * ClassName: Directory_
 * Package: com.tge.file
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/15 - 10:44
 * Version:
 */
public class Directory_ {
    public static void main(String[] args) {

    }

    @Test
    public void m1() {
        String str = "e:\\fileTest\\news1.txt";

        File file = new File(str);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("文件不存在");
        }
    }

    @Test
    public void m2() {
        String str = "e:\\fileTest1";

        File file = new File(str);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("目录不存在");
        }
    }

    @Test
    public void m3() {
        String str = "e:\\fileTest1\\a\\b\\c1";

        File file = new File(str);
        if (file.exists()) {
            System.out.println("目录已存在");
        } else {
            if (file.mkdir()) {
                System.out.println("目录创建成功");
            }else {
                System.out.println("目录创建失败");
            }
        }
    }
}

