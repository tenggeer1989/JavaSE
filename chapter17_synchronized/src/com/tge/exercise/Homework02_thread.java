package com.tge.exercise;

/**
 * ClassName: Homework02_thread
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/14 - 22:31
 * Version:
 */
public class Homework02_thread {
    public static void main(String[] args) {
        Bank user = new Bank();
        Thread t1 = new Thread(user);
        Thread t2 = new Thread(user);
        t1.setName("用户1");
        t2.setName("用户2");
        t1.start();
        t2.start();

    }
}

class Bank implements Runnable{
    private int money = 10000;
    private boolean loop = true;

    public void getMoney() throws InterruptedException {
        synchronized (this) {
            if(money <= 0){
                System.out.println("账户余额不足");
                loop = false;
                return;

            }
            Thread.sleep(500);

            money -= 1000;

            System.out.println(Thread.currentThread().getName() + "取了1000元，账户还剩" + money);
        }

    }
    @Override
    public void run() {
        while (loop) {
            try {
                getMoney();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
