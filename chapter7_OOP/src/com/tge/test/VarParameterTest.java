package com.tge.test;

/**
 * ClassName: VarParameterTest
 * Package: com.tge.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/27 - 9:48
 * Version:
 */
public class VarParameterTest {
    public static void main(String[] args) {
        HspMethod hs = new HspMethod();
        String zhangsan = hs.showScore("张三", 92, 100);
        String lisi = hs.showScore("李四", 92, 100, 100);
        String wangwu = hs.showScore("王五", 92, 100, 100, 50, 50);
        System.out.println(zhangsan);
        System.out.println(lisi);
        System.out.println(wangwu);
    }
}

class HspMethod {
    String name;

    public String showScore(String name,int...scores){

        int res = 0;
        for (int i = 0; i < scores.length; i++) {
            res += scores[i];
        }
        return name + "的"+ scores.length + "门课的总分为："+res;
    }

}
