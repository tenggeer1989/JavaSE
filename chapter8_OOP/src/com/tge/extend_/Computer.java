package com.tge.extend_;

import java.awt.datatransfer.DataFlavor;

/**
 * ClassName: Computer
 * Package: com.tge.extend_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/29 - 23:48
 * Version:
 */
public class Computer {
    String cpu;
    String mem;
    String disk;

    public Computer() {
    }

    public Computer(String cpu, String mem, String disk) {
        this.cpu = cpu;
        this.mem = mem;
        this.disk = disk;
    }

    public String getDetails() {
        return "cpu = " + this.cpu + "\t" + "mem = " + this.mem + "\t" + "disk = " + this.disk;
    }
}
