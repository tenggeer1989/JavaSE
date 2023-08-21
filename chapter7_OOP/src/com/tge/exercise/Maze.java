package com.tge.exercise;

/**
 * ClassName: Maze
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/26 - 23:32
 * Version:
 */

//老鼠走出迷宫
public class Maze {
    public static void main(String[] args) {
        // 1. 创建一个二维数组代表迷宫
        // 2. 先规定map数组的元素值： 0 表示可以走，1表示障碍物
        int[][] map = new int[8][7];
        // 3. 将最上面的一行和最下面的一行，全部设置为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        // 4. 将最右面的一列和最左面的一列，全部置为1
        for (int i = 0; i < 7; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        // 5. 中间的障碍
        map[3][1] = 1;
        map[3][2] = 1;

        //输出当前地图
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
}
