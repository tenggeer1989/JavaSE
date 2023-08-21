package com.tge.thread;

/**
 * ClassName: Thread01
 * Package: com.tge.synchronized_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/14 - 0:32
 * Version:
 */
public class Thread01 {
    public static void main(String[] args) {
        new Cat().run();
    }
}

// 1. 当一个类实现了thread类，就可以当一个线程
// 2. 重写run方法，写上自己的业务代码
// 3. run thread 类 实现了  Runnable 接口的run 方法
class Cat extends Thread{

    @Override
    public void run() {
        int times = 1;
        while (true) {

            System.out.println("喵喵。。。。" + times + "次" + "，线程为：" + Thread.currentThread().getName());
            // 让该线程休眠1秒

            times++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (times == 10){
                break;
            }

        }
    }
}