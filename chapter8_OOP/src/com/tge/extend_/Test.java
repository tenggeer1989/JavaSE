package com.tge.extend_;

/**
 * ClassName: Test
 * Package: com.tge.extend_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/29 - 23:52
 * Version:
 */
public class Test {
    public static void main(String[] args) {
        PC p = new PC("intel","8G","512G","macbook");
        NotePad np = new NotePad("AMD","4G","128G","black");


        p.printInfo();
        np.printInfo();
    }
}
