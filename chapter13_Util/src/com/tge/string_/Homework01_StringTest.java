package com.tge.string_;

/**
 * ClassName: Homework01
 * Package: com.tge.string_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/9 - 10:36
 * Version:
 */
public class Homework01_StringTest {
    public static void main(String[] args) {
        String str = "abcdef";
        String newStr = null;
        try {
            newStr = reverse(str, 2, 5);
            System.out.println(newStr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static String reverse(String str, int start, int end) {
        if(!(str != null && start >=0 && end > start && end < str.length())){
            throw new RuntimeException("参数不正确");
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(i < start){
                sb.append(str.charAt(i));
            } else if(i >= start && i <= end){
                sb.append(str.charAt(end - i + start));
            }else {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }
}
