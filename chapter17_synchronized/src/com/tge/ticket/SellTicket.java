package com.tge.ticket;

/**
 * ClassName: SellTicket
 * Package: com.tge.ticket
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/14 - 19:23
 * Version:
 */
public class SellTicket {
    public static void main(String[] args) {
        Sell s = new Sell();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);
        t1.start();
        t2.start();
        t3.start();

    }
}

class Sell implements Runnable{
    private  int  ticket = 100;
    private  boolean loop = true;

   public synchronized  void sell(){


           if (ticket <= 0){
               System.out.println("票已售完！！！");
               loop = false;
               return;
           }
           try {
               Thread.sleep(50);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }

           System.out.println(Thread.currentThread().getName() + "卖出一张票" + (--ticket));


   }

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}
