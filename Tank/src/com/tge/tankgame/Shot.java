package com.tge.tankgame;

/**
 * ClassName: Shot
 * Package: com.tge.tankgame03
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/30 - 9:28
 * Version:
 */
public class Shot implements Runnable{

    int x; // 子弹x坐标
    int y; // 子弹y坐标
    int direct;
    int speed = 10;
    boolean isLive = true; // 子弹是否存活

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }



    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //根据方向改变x,y坐标
            switch (direct){
                case 0:
                    y-= speed;
                    break;
                case 1:
                    x+= speed;
                    break;
                case 2:
                    y+= speed;
                    break;
                case 3:
                    x-= speed;
                    break;
            }
            // 测试子弹输出的x,y坐标
            System.out.println("子弹 x=" +x + " y=" + y);

            // 当子弹移动到边界时，销毁
            // 当子弹碰到敌人坦克时，也应该结束
            if (!(x >=0 && x<=1000 &&y>=0 && y<=750 && isLive)){
                isLive = false;
                break;
            }
        }
    }
}
