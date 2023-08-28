package com.tge.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName: RegExp09
 * Package: com.tge.regexp
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/28 - 23:48
 * Version:
 */
public class RegExp09 {
    public static void main(String[] args) {
        String content = "hello111111 ok";
        //String regStr = "\\d+"; // 默认是贪婪匹配
        String regStr = "\\d+?";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
