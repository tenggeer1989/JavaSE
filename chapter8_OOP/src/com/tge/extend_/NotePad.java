package com.tge.extend_;

/**
 * ClassName: NotePad
 * Package: com.tge.extend_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/29 - 23:52
 * Version:
 */
public class NotePad extends Computer {
    String color;

    public NotePad(String cpu, String mem, String disk, String color) {
        super(cpu, mem, disk);
        this.color = color;
    }

    public void printInfo() {
        System.out.println("NotePad信息为：");
        System.out.println(getDetails() + "\t" + "color = " + color);
    }
}
