package com.tge.date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * ClassName: LocalDate_
 * Package: com.tge.date_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/9 - 10:22
 * Version:
 */
public class LocalDate_ {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getHour());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format = dtf.format(ldt);
        System.out.println(format);

    }
}
