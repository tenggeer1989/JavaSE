package com.tge.tankgame;

/**
 * ClassName: Bomb
 * Package: com.tge.tankgame03
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/30 - 10:41
 * Version:
 */
public class Bomb {
    int x,y;
    int life = 9;
    boolean isLive = true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //减少生命值
    public void lifeDown(){
        if (life > 0){
            life--;
        }else {
            isLive = false;
        }
    }
}
