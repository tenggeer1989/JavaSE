package com.tge.outputstream;

import java.io.*;

/**
 * ClassName: BufferedCopy2
 * Package: com.tge.outputstream
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/16 - 10:13
 * Version:
 */
public class BufferedCopy2 {
    public static void main(String[] args) {
        String srcFile = "e:\\download\\google download\\wallhaven-6oxgp6.jpg";
        String dstFile = "e:\\fileTest1\\tupian.jpg";

        // 创建对象
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcFile));
            bos = new BufferedOutputStream(new FileOutputStream(dstFile));

            byte[] bytes = new byte[1024];
            int readLen = 0;
            while ((readLen = bis.read(bytes)) != -1){
                bos.write(bytes,0,readLen);
            }
            System.out.println("拷贝完成！！！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (bos != null){
                    bos.close();
                }
                if (bis != null){
                    bis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
