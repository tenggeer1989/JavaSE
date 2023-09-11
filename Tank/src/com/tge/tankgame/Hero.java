package com.tge.tankgame;


/**
 * ClassName: Hero
 * Package: com.tge.tankgame2
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/29 - 22:30
 * Version:
 */
public class Hero extends Tank {

    // 定义一个shot对象
    Shot shot = null;

    //Vector<Shot> shots = new Vector<>();
    public Hero(int x, int y) {
        super(x, y);
    }

    public void shotEnemyTank(){
        //创建 Shot 对象, 根据当前Hero对象的位置和方向来创建Shot
        switch (getDirect()) {//得到Hero对象方向
            case 0: //向上
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1: //向右
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2: //向下
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3: //向左
                shot = new Shot(getX(), getY() + 20, 3);
                break;
        }

        //shots.add(shot);
        //启动我们的Shot线程
        new Thread(shot).start();


    }

}
