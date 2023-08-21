package com.tge.thread;

/**
 * ClassName: Thread02
 * Package: com.tge.synchronized_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/14 - 19:00
 * Version:
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();

    }
}

class Dog implements Runnable {

    int count = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("小狗汪汪叫..hi" + (++ count) + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(count == 10 ){
                break;
            }
        }
    }
}