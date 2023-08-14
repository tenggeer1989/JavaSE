package com.tge.exercise;

import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

/**
 * ClassName: Homework_thread
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/14 - 22:03
 * Version:
 */
public class Homework01_thread {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B(t1);


        t1.start();
        t2.start();

    }
}

class A extends Thread {
    private boolean loop = true;

    @Override
    public void run() {

        while (loop) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Math.ceil(Math.random() * 100));
        }
    }

    public void setLoop(boolean loop){
        this.loop = loop;
    }
}


class B extends Thread {
    private A a;
    private Scanner sc = new Scanner(System.in);

    public B(A a){
        this.a = a;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("请输入你的指令：");
            if(sc.nextLine().equals("Q")){
                a.setLoop(false);
                break;
            }
        }
    }
}
