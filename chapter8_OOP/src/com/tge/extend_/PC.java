package com.tge.extend_;

/**
 * ClassName: PC
 * Package: com.tge.extend_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/29 - 23:52
 * Version:
 */
public class PC extends Computer {

    String brand;


    public PC(String cpu, String mem, String disk, String brand) {
        super(cpu, mem, disk);
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("PC信息为：");
        System.out.println(getDetails() + "\t" + "brand = " + brand);
    }
}
