package com.tge.test;

/**
 * ClassName: SquenceTest
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/25 - 22:00
 * Version:
 */
public class SequenceTest {
    public static void main(String[] args) {
        String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if ("金毛狮王".equals(names[i])) {
                System.out.println("金毛狮王为第" + (i + 1) + "个元素");
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("没有找到相应信息");
        }

    }
}
