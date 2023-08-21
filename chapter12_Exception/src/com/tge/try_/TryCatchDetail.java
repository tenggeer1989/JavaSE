package com.tge.try_;

/**
 * ClassName: TryCatchDetail
 * Package: com.tge.try_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/7 - 19:00
 * Version:
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "张三";
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("异常为:" + e.getMessage());
        }

    }
}
