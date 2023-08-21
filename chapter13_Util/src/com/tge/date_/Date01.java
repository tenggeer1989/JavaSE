package com.tge.date_;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Date01
 * Package: com.tge.date_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/9 - 10:04
 * Version:
 */
public class Date01 {
    public static void main(String[] args) {
        // 第一种
        Date d1 = new Date();
        System.out.println(d1);

        // 第二种
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = sdf.format(d1);
        System.out.println("当前 日期=" + format);

    }
}
