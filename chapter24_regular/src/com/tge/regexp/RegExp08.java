package com.tge.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName: RegExp08
 * Package: com.tge.regexp
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/28 - 23:37
 * Version:
 */
public class RegExp08 {
    public static void main(String[] args) {

        String content = "hello韩顺平教育 jack韩顺平老师 韩顺平同学hello韩顺平学生";

        // 找到 韩顺平教育 、韩顺平老师、韩顺平同学 子字符串
        // String regStr = "韩顺平教育|韩顺平老师|韩顺平同学";
        // String regStr = "韩顺平(?:教育|老师|同学)";

        // 找到 韩顺平 这个关键字,但是要求只是查找韩顺平教育和 韩顺平老师 中包含有的韩顺平
        // String regStr = "韩顺平(?=教育|老师)";

        //找到 韩顺平 这个关键字,但是要求只是查找 不是 (韩顺平教育 和 韩顺平老师) 中包含有的韩顺平
        String regStr = "韩顺平(?!教育|老师)";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()){
            System.out.println(matcher.group(0));
        }

    }
}
