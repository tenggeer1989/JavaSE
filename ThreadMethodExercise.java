package com.tge.exercise;

/**
 * ClassName: ThreadMethodExercise
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/14 - 20:15
 * Version:
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {

        TMethod tMethod = new TMethod();
        Thread t = new Thread(tMethod);
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1000);
            System.out.println("主线程：hi" + i + "次");
            if (i == 5){
                System.out.println("主线程暂时停止，等待子线程全部输出完");
                t.start();
                t.join();
            }

        }
        System.out.println("主线程结束");
    }
}

class TMethod implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("子线程：hello" + i + "次");
        }
        System.out.println("子线程结束");
    }
}
