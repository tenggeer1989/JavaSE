package com.tge.interface_;

/**
 * ClassName: Phone
 * Package: com.tge.interface_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/4 - 22:57
 * Version:
 */
public class Phone implements Interface{

    @Override
    public void start() {
        System.out.println("手机开始工作。。。。");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作。。。。");
    }
}
