package com.tge.tankgame;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Vector;

/**
 * ClassName: MyPanel
 * Package: com.tge.tankgame2
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/29 - 22:33
 * Version:
 */
public class MyPanel extends JPanel implements KeyListener, Runnable {
    // 定义我的坦克
    Hero hero = null;
    // 定义敌人坦克，放入到Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    // 定义存放Node对象的Vector
    Vector<Node> nodes = new Vector<>();
    // 定义一个vector,存放炸弹
    Vector<Bomb> bombs = new Vector<>();

    int enemyTankSize = 3;

    // 定义三张炸弹图片，用于显示爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;


    public MyPanel(String key) {
        // 先判断记录文件是否存在
        // 如果存在，就正常执行，如果文件不存在提示只能开启新游戏，key = 1
        File file = new File(Recorder.getRecordFile());
        if(file.exists()){
            nodes = Recorder.getNodesAndEnemyTankRec();
        }else {
            System.out.println("文件不存在，只能开启新的游戏");
            key = "1";
        }

        // 将MyPanel对象的 enemyTanks 设置给 Recorder 的 enemyTanks
        Recorder.setEnemyTanks(enemyTanks);
        hero = new Hero(500, 600);// 初始化自己坦克

        switch (key){
            case "1":
                // 初始化敌人坦克
                for (int i = 0; i < enemyTankSize; i++) {
                    // 创建一个敌人的坦克
                    EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
                    // 将enemyTanks 设置给 enemyTank
                    enemyTank.setEnemyTanks(enemyTanks);
                    // 设置方向
                    enemyTank.setDirect(2);
                    // 启动敌人坦克线程
                    new Thread(enemyTank).start();
                    // 给敌人坦克加入一颗子弹
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
                    // 加入enemyTank的Vector成员
                    enemyTank.shots.add(shot);
                    // 启动 shot 对象
                    new Thread(shot).start();
                    // 加入
                    enemyTanks.add(enemyTank);
                }
                break;
            case "2":// 继续上局
                // 初始化敌人坦克
                for (int i = 0; i < nodes.size(); i++) {
                    Node node = nodes.get(i);
                    // 创建一个敌人的坦克
                    EnemyTank enemyTank = new EnemyTank(node.getX(), node.getY());
                    // 将enemyTanks 设置给 enemyTank
                    enemyTank.setEnemyTanks(enemyTanks);
                    // 设置方向
                    enemyTank.setDirect(node.getDirect());
                    // 启动敌人坦克线程
                    new Thread(enemyTank).start();
                    // 给敌人坦克加入一颗子弹
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
                    // 加入enemyTank的Vector成员
                    enemyTank.shots.add(shot);
                    // 启动 shot 对象
                    new Thread(shot).start();
                    // 加入
                    enemyTanks.add(enemyTank);
                }
                break;
            default:
                System.out.println("你的输入有误");
        }


        // 初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));

        // 播放音乐
        new AePlayWave("Tank\\src\\111.wav").start();
    }

    //编写方法，显示我方击毁敌方坦克的信息
    public void showInfo(Graphics g) {

        //画出玩家的总成绩
        g.setColor(Color.BLACK);
        Font font = new Font("宋体", Font.BOLD, 25);
        g.setFont(font);

        g.drawString("您累积击毁敌方坦克", 1020, 30);
        drawTank(1020, 60, g, 0, 0);//画出一个敌方坦克
        g.setColor(Color.BLACK);//这里需要重新设置成黑色
        g.drawString(Recorder.getAllEnemyTankNum() + "", 1080, 100);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);// 填充矩形，默认黑色
        showInfo(g);
        // 画出自己坦克-封装方法
        if(hero != null && hero.isLive){
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
        }


        // 画出hero子弹
        // if (hero.shot != null && hero.shot.isLive == true) {
        //     g.draw3DRect(hero.shot.x, hero.shot.y, 2, 2, false);
        // }


            if (hero.shot != null && hero.shot.isLive == true) {
                g.draw3DRect(hero.shot.x, hero.shot.y, 2, 2, false);
            }


        // 如果bombs 集合中有对象，就画出
        for (int i = 0; i < bombs.size(); i++) {
            // 取出炸弹
            Bomb bomb = bombs.get(i);
            // 根据当前bomb对象的life值画出对于图片
            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            }

            // 让炸弹生命值减少
            bomb.lifeDown();
            // 如果炸弹生命值为0，移除炸弹
            if (bomb.life == 0) {
                bombs.remove(i);
            }

        }

        // 画出敌人的坦克, 遍历Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            // 取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
            // 画出敌人坦克所有子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);

                if (shot.isLive) {
                    g.draw3DRect(shot.x, shot.y, 2, 2, false);
                } else {
                    enemyTank.shots.remove(shot);
                }
            }
        }


    }

    // 编写方法，画出坦克
    public void drawTank(int x, int y, Graphics g, int direct, int type) {

        // 根据不同类型坦克，设置不同颜色
        switch (type) {
            case 0: // 敌人的坦克
                g.setColor(Color.cyan);
                break;
            case 1: // 我的坦克
                g.setColor(Color.yellow);
                break;
        }

        // 根据坦克方向，来绘制对应形状坦克
        // direct 表示方向(0: 向上 1 向右 2 向下 3 向左 )
        switch (direct) {
            case 0: // 表示向上
                g.fill3DRect(x, y, 10, 60, false);// 画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);// 画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);// 画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);// 画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y);// 画出炮筒
                break;
            case 1: // 表示向右
                g.fill3DRect(x, y, 60, 10, false);// 画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);// 画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);// 画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);// 画出圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);// 画出炮筒
                break;
            case 2: // 表示向下
                g.fill3DRect(x, y, 10, 60, false);// 画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);// 画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);// 画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);// 画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);// 画出炮筒
                break;
            case 3: // 表示向左
                g.fill3DRect(x, y, 60, 10, false);// 画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);// 画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);// 画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);// 画出圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20);// 画出炮筒
                break;
            default:
                System.out.println("暂时没有处理");
        }

    }

    // 编写方法，判断我方的子弹是否击中敌人坦克.
    // 什么时候判断 我方的子弹是否击中敌人坦克 ? run方法
    // 后面我们将 enemyTank 改成 tank名称
    public void hitTank(Shot s, Tank enemyTank) {
        // 判断s 击中坦克
        switch (enemyTank.getDirect()) {
            case 0: // 坦克向上
            case 2: // 坦克向下
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    // 当我的子弹击中敌人坦克后，将enemyTank 从Vector 拿掉
                    enemyTanks.remove(enemyTank);
                    // 当我方击毁敌方坦克时allEnemyTankNum++
                     if(enemyTank instanceof EnemyTank){
                        Recorder.addAllEnemyTankNum();
                    }
                    // 创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1: // 坦克向右
            case 3: // 坦克向左
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    // 当我的子弹击中敌人坦克后，将enemyTank 从Vector 拿掉
                    enemyTanks.remove(enemyTank);
                    if(enemyTank instanceof EnemyTank){
                    Recorder.addAllEnemyTankNum();
                    }
                    // 创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    // 编写方法，判断敌人坦克是否击中我方坦克
    public void hitHero(){
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);

            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if(hero.isLive && shot.isLive){
                    hitTank(shot,hero);
                }
            }
        }
    }

    // 判断是否击中了敌人坦克
    public void hitEnemy(){
        if (hero.shot != null && hero.shot.isLive) {
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                hitTank(hero.shot, enemyTank);
            }
        }
    }



    @Override
    public void keyTyped(KeyEvent e) {

    }

    // 处理wdsa 键按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_W) {// 按下W键
            // 改变坦克的方向
            hero.setDirect(0);//
            // 修改坦克的坐标 y -= 1
            if (hero.getY() > 0) {
                hero.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {// D键, 向右
            hero.setDirect(1);
            if (hero.getX() + 60 < 1000) {
                hero.moveRight();
            }

        } else if (e.getKeyCode() == KeyEvent.VK_S) {// S键
            hero.setDirect(2);
            if (hero.getY() + 60 < 750) {
                hero.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {// A键
            hero.setDirect(3);
            if (hero.getX() > 0) {
                hero.moveLeft();
            }
        }

        // 如果用户按下的是J,就发射
        if (e.getKeyCode() == KeyEvent.VK_J) {
            System.out.println("用户按下了J, 开始射击.");
            // 第一次填弹或子弹已销毁时，才可以发射第二发
            if (hero.shot == null || !hero.shot.isLive) {
                hero.shotEnemyTank();
            }
        }

        // 让面板重绘
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    @Override
    public void run() {
        // 每隔100ms重绘区域
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // 判断我们子弹是否击中敌人坦克
            hitEnemy();
            // 判断敌人坦克是否击中了我方坦克
            hitHero();
            this.repaint();
        }
    }
}
