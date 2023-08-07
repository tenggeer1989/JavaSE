package com.tge.homework;

/**
 * ClassName: Homework08
 * Package: com.tge.homework
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/6 - 22:22
 * Version:
 */
public class Homework08 {
    public static void main(String[] args) {
        Color color = Color.BLUE;
        switch(color) {
            case RED, BLACK, BLUE,YELLOW,GREEN:
                color.show();
                break;
        }
    }
}

enum Color implements colorShow{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值为" + redValue + "," + greenValue + "," + blueValue);
    }
}

interface colorShow{
    public void show();
}
