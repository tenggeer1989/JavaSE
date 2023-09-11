package com.tge.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName: RegExp10
 * Package: com.tge.regexp
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/28 - 23:51
 * Version:
 */
public class RegExp10 {
    public static void main(String[] args) {

        // 1.验证是否为汉字
        // String content = "我hello爱111111你ok";
        // String regStr = "[\u0391-\uff05]";

        // 2.邮政编码  要求：1-9开头的六位数字
        // String content = "750300";
        // String regStr = "^[1-9]([0-9]){5}$";
        // 3.QQ号码 1-9开头的一个（5-10位）的数字
        // String content = "43866431";
        // String regStr = "^[1-9]([0-9]){4,9}$";
        // 4.手机号码  必须以13,14,15,18 开头的11位数
        String content = "13704711025";
        String regStr = "^1[3|4|5|8][0-9]{9}$";


        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
