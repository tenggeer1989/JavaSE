package com.tge.tankgame;



import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

/**
 * ClassName: TankGame02
 * Package: com.tge.tankgame2
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/29 - 22:32
 * Version:
 */
public class TankGame extends JFrame {
    //定义MyPanel
    MyPanel mp = null;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        TankGame TankGame = new TankGame();
    }

    public TankGame() {
        System.out.println("请输入选择 1：新游戏  2：继续上局");
        String key = sc.next();
        mp = new MyPanel(key);
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);//把面板(就是游戏的绘图区域)
        this.setSize(1000, 750);
        this.addKeyListener(mp);//让JFrame 监听mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        // 在JFrame
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("监听到关闭窗口");
                Recorder.keepRecord();
                System.exit(0);

            }
        });
    }
}
